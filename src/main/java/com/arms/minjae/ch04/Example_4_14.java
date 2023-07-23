package com.arms.minjae.ch04;

public class Example_4_14 {
    public static void main(String[] args) {
        NumberGame numberGame = new NumberGame();
        int answer = numberGame.getAnswerByRandom();
//        System.out.println(answer);
        System.out.println("1~100 사이의 정수를 입력하세요.");
        int input = numberGame.getInputFromUser();
        
        while(true){
            if(numberGame.startGame(answer, input)){
                //실패 시 재입력받기
                input = numberGame.getInputFromUser();
            }else
                //정답 맟춤
                break;
        }
    }

    //재귀호출로 재입력받으려고 했으나 scan.close()를 하였을 때 무한반복문에 빠짐. 왜??


}
