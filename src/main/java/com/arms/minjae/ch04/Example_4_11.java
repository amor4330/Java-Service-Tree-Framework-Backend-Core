package com.arms.minjae.ch04;

public class Example_4_11 {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세 번째 값

        System.out.print(num1 + ", " + num2);
        for (int i = 0; i < 8; i++) {

            if (i % 3 == 0) {
                num3 = num1 + num2;
                System.out.print(", " + num3);
            } else if (i % 3 == 1) {
                num1 = num2 + num3;
                System.out.print(", " + num1);
            } else {
                num2 = num3 + num1;
                System.out.print(", " + num2);
            }

        }
    }
}
