package com.arms.minjae.ch04;

import java.util.Scanner;

public class NumberGame {

    private int answer;
    private int count;

    public int getAnswerByRandom() {
        answer = (int)((Math.random() * 100) + 1);
        return answer;
    }

    public int getInputFromUser() {
        Scanner scan = new Scanner(System.in);
        int output = 0;

        try {
            output = Integer.valueOf(scan.next());
            if( output < 1 || output > 100){
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(" 1~100 사이의 숫자를 정확하게 입력하세요");
        }

        return output == 0 ? getInputFromUser() : output;
    }

    public boolean startGame(int answer, int input) {
        if (input == answer) {
            System.out.println("정답입니다. 도전 횟수: " + count);
            count = 0;
            return false;
        } else if (input > answer) {
            System.out.println(input + "보다 더 낮은 수로 시도해보세요");
            count++;
            return true;
        } else {
            System.out.println(input + "보다 더 큰 수로 시도해보세요");
            count++;
            return true;
        }
    }
}
