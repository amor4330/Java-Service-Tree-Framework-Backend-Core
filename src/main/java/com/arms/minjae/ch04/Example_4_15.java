package com.arms.minjae.ch04;

public class Example_4_15 {
    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();

        int input = palindrome.getInputFromUser();

        if (palindrome.isPalindrome(input)) {
            System.out.println("회문입니다.");
        } else {
            System.out.println("회문이 아닙니다.");
        }

    }
}
