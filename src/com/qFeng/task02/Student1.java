package com.qFeng.task02;

public class Student1 {
    //定义名字
    private String name;
    //定义年龄
    private int age;
    //定义性别
    private String sex;
    //定义语数英成绩
    private double english,math,chinese;
    public Student1(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    //封装英语
    public void setEnglish(double english){
     if(english>100 || english<0){
     }   else { this.english=english; }
    }
    public double getEnglish(){
        return english;
    }
    //封装数学
    public void setMath(double math){
     if(english>100 || english<0){
     }   else { this.math=math; }
    }
    public double getMath(){
        return math;
    }
    //封装语文
    public void setChinese(double chinese){
     if(english>100 || english<0){
     }   else { this.chinese=chinese; }
    }
    public double getChinese(){
        return chinese;
    }

    @Override
    public String toString() {
        return "学生信息："+"\n姓名："+
                name+"\n年龄:"+age+"\n性别:"+sex;
    }
    public String toString(double e,double c,double m){
        double max,min;
        english=e;
        chinese=c;
        math=m;
        max=e>c?(e>m?e:m):(c>m?c:m);
        min=e<c?(e<m?e:m):(c<m?c:m);
        return "三门科目的总分为："+(c+m+e)+"\n平均分为："
                +(c+m+e)/3+"\n最高分为："+max+"\n最低分为："
                +min;

    }
//    public static void print(){
//        this.english
//    }
}
