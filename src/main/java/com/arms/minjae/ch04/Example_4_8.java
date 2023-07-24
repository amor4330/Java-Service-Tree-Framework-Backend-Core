package com.arms.minjae.ch04;

public class Example_4_8 {
    public static void main(String[] args) {

        // 2x + 4y = 10

        int count = 0;

        for (int x = 0; 2 * x <= 10; x++) {
                int x2 = 2 * x;

            for (int y = 0; 4 * y <= 10; y++) {
                int y4 = 4 * y;

                if (x2 + y4 == 10) {
                    System.out.println("x: " + x + ", y: " + y);
                    break;
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
