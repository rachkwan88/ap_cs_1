package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Tutorial tutorial = new Tutorial();
        tutorial.test1();
        tutorial.test2();
        tutorial.test3();
        String test4 = tutorial.decToBinary(0);
        System.out.println(test4);
        tutorial.test4();
        tutorial.test5();
        tutorial.test7();
        tutorial.test8();
    }
}
