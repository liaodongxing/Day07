package com.qianFeng.Object4;

public class Parametric1 {
    String name="";
    int age;
    double height;
    double weight;
    String hobby;
    public Parametric1(String name,int age,
                       double height,double weight,String hobby){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.hobby=hobby;
    }
    public String getName(){
        return name;
    }public int getAge(){
        return age;
    }public double getHeight(){
        return height;
    }public double getWeight() {
        return weight;
    }public String getHobby(){
        return hobby;
    }

    @Override
    public String toString() {
        return "学生信息：\n姓名："+name+"\n年龄："+age+
                "\n身高："+height+"\n体重："+weight+"\n爱好："+hobby;
    }
}
