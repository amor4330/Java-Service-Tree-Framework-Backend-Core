package com.arms.minjae.ch04;

import java.util.Scanner;

public class Palindrome {


    public int getInputFromUser() {
        Scanner scan = new Scanner(System.in);
        int output = 0;

        try {
            output = Integer.valueOf(scan.next());
            if( output < 0){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("다시 입력해주세요.");
        }

        return output == 0 ? getInputFromUser() : output;
    }

    public boolean isPalindrome(int input) {
        //나머지 연산자 이용
        int copy = input;
        int reverse = 0;
        while (copy != 0) {
            reverse *= 10;
            reverse += copy % 10;
            copy /= 10;
        }

//        String tmp = input + "";
//        StringBuffer sb = new StringBuffer();
//        for (int i = tmp.length()-1; i >= 0; i--) {
//            sb.append(tmp.charAt(i));
//        }
//        return tmp.equals(sb.toString());
        return input == reverse;
    }
}
