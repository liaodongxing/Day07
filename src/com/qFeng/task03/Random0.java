package com.qFeng.task03;

import java.util.Random;
import java.util.Scanner;

public class Random0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String y=sc.next();
        Random ran=new Random();
        int a=0, b=0 , c=0 , d=0 , e=0;
        do{
            int i=ran.nextInt(5);
            switch (i) {
                case 0:
                    System.out.println("本次抽中学员为：保罗" );
                    a++;
                    break;
                case 1:
                    System.out.println("本次抽中学员为：韦德\n");
                    b++;
                    break;
                case 2:
                    System.out.println("本次抽中学员为：安东尼\n");
                    c++;
                    break;
                case 3:
                    System.out.println("本次抽中学员为：科比\n");
                    d++;
                    break;
                default:
                    System.out.println("本次抽中学员为：詹姆斯\n");
                    e++;
                    break;
            }
            }while (sc.equals(y));

    }

}
