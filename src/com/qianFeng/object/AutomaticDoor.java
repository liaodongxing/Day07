package com.qianFeng.object;

import java.util.Scanner;

public class AutomaticDoor {
    String handle="50厘米";
    double width=100;
    double height=300;
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    public void Behavior(){
        if(p>10){
            System.out.println("自动开门");
        }else {
            System.out.println("没人不开门");
        }

    }
}
