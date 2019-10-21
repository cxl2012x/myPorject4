package com.jingyuk.git;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");
        System.out.println("我是你的事实!");

        //测试语句
        test2();
        Second second = new Second();
        second.test();
    }

    public static void test2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = "+i);
            i +=1;  //加1再输出
            System.out.println(i);
        }
    }
}
