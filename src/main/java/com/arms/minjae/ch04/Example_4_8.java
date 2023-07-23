package com.arms.minjae.ch04;

public class Example_4_8 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;


        while (x <= 5) {
            if ((2 * y) % (5 - x) == 0) {
                y++;
                System.out.println("x: " + x + ", y: " + y);
            }
            x++;
        }
    }
}
