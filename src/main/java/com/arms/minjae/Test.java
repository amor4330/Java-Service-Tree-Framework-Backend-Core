package com.arms.minjae;

public class Test {

    public static void main(String[] args) {


        //조건식 뿐만 아니라 증감식에서도 변수를 여러개 작성할 수 있다.
        for(int i = 0, j = 1; i < 10 && j < 20; i++, j*=3){
            System.out.println(i);
            System.out.println(j);
            System.out.println("반복 횟수: " + (i+1));
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i < 5; i++) {
            System.out.println(i + " 구구단");
            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i*j));
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
        }

        boolean flag = true;
        int i = 0;

        while (flag) {

            if (i > 10) {
                flag = false;
                System.out.println(i + "번 째");
            }
            i++;
        }


        flag = true;
        i = 0;
        do{
            System.out.println("실행" + i);
            if (i > 5) {
                flag = false;
            }
            i++;
        }while(flag);
    }
}
