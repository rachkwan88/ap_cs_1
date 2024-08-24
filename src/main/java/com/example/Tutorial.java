package com.example;

public class Tutorial {
    public void test1() {
        // int
        int a = 0;
        System.out.println(a);
        int b = Integer.MAX_VALUE + 1;
        System.out.println(b);
    }

    public void test2() {
        // double
        double a = 0;
        System.out.println(a);
        double b = Double.MAX_VALUE + 1;
        System.out.println(b);
    }

    public void test3() {
        // int
        int a = 0xFF;
        System.out.println(a);

    }

    public void test4() {
        // int
        int a = 4;
        System.out.println(a++); // 4
        System.out.println(++a);// 6

    }

    public String decToBinary(int a) {
        String result = "";
        while (true) {
            if (a % 2 == 0) {
                result = "0" + result;
            } else {
                result = "1" + result;
            }
            a /= 2;
            if (a == 0) {
                break;
            }
        }
        return (result);
    }

    public void test5() {
        for (int i = 1; i < 10;) {
            System.out.print(++i);
        }
        System.out.println(" ");
        for (int i = 1; i < 10;) {
            System.out.print(i++);
        }
        System.out.println(" ");
    }

    public void test6() {

        System.out.print("a");
        System.out.println("b");

        System.out.print("a");
        System.out.print("b");
        System.out.print("\n");

        System.out.print("a");
        System.out.print("b");
        System.out.println("");

        System.out.println("\\n"); // '\n'
        System.out.println("\\\\");

    }

    public void test7() {
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 14;
        array[2] = 9;
        array[3] = 14;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("");
    }

    public void test8() {
        int[][] array3 = new int[2][3]; // 2x3

        array3[0][0] = 1;
        array3[0][1] = 2;
        array3[0][2] = 3;
        array3[1][0] = 4;
        array3[1][1] = 5;
        array3[1][2] = 6;

        for (int i = 0; i < array3.length; i++) {

            for (int j = 0; j < array3[i].length; j++) {
                if (j != 0) {
                    System.out.print(",");
                }
                System.out.print(array3[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}