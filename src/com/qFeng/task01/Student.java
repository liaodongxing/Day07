package com.qFeng.task01;

import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        String education=sc.next();
        Student1 s=new Student1(name,age,education);
        System.out.println(s.toString());
    }
}
