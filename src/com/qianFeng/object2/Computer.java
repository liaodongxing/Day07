package com.qianFeng.object2;

public class Computer {
    public static void main(String[] args) {
        Computer1 c=new Computer1();

        c.setPrand("外星人");
        c.setColor("粉红色");
        System.out.println("颜色："+c.getColor()+",品牌："+c.getPrand());
    }
}
