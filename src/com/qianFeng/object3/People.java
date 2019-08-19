package com.qianFeng.object3;

public class People {
    public static void main(String []args){
        Someone s=new Someone();
        s.setAge(10);
        s.setName("张三");
        s.setHeight(90.58);
        System.out.println("姓名："+s.getName()
                +"\n年龄："+s.getAge()+"岁\n身高:"+s.getHeight()+"厘米");
    }
}
