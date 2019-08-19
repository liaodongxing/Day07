package com.qFeng.task01;

public class Student1 {
    //名字
    String name;
    //年龄
    int age;
    //学历
    String education;

    public Student1(String n,int a,String e){
        name=n;
        age=a;
        education=e;
        if ( age > 40 ||age < 18){
            age=19;
            System.out.println("你输入的年龄有误，默认为19岁");
        }
        else{
            age=a;
        }
        if(education.equals("大专")||education.equals("本科")||education.equals("研究生")){
            education=e;
        }else {
            education="大专";
            System.out.println("你输入的学历有误，默认为大专");
        }
    }

    @Override
    public String toString() {
        return "姓名："+name+"，年龄："+age+"，学历："+education;
    }
}
