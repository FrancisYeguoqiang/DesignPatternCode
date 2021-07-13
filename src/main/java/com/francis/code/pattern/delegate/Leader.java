package com.francis.code.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Francis
 * @Date 2020/9/26 19:00
 * @Version 1.0
 */
public class Leader implements IEmployee {

    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader() {
        targets.put("加密",new EmployeeA());
        targets.put("登录",new EmployeeB());
    }

    //项目经理自己不干活
    public void doing(String command){
        targets.get(command).doing(command);
    }

}
