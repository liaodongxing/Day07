package com.qianFeng.object3;

public class Someone {
    private double height;
    private double weight;
    private String name;
    private int age;

    public void setHeight(double h){
        if (h>200){
            height=200;
        }else if (h<100){
            height=100;
        }else {
            height=h;
        }
    }
    public double getHeight(){
        return height;
    }
    public void setAge(int a){
        if (a<18){
            age=18;
        }else {
            age=a;
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
