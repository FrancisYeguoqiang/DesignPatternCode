package com.francis.code.pattern.template;

/**
 * @Author Francis
 * @Date 2020/9/26 17:59
 * @Version 1.0
 */
public class ShoppingTemplateTest {
    public static void main(String[] args) {
        Shopping shoesShopping = new ShoesShopping();
        shoesShopping.buyGoods();
        Shopping clothesShopping = new ClothesShopping();
        clothesShopping.buyGoods();
    }
}
