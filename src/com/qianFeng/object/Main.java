package com.qianFeng.object;

public class Main {
    public static void main(String [] args){
        Door();
    }
    public static void Door(){
        System.out.println("push plate");
        AutomaticDoor aut=new AutomaticDoor();
        aut.p=1;
        aut.Behavior();
        System.out.println(aut.handle);
    }
}
