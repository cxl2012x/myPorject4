package com.jingyuk.git;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        test();
    }

    public static void test(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = "+i);
            i +=1;
        }
    }
}
