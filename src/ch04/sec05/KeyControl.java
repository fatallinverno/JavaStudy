package ch04.sec05;

/*
조건식에 true를 사용하면 while(true) {...}가 되어서 무한 반복하게 된다
이 경우 언젠가는 while 문을 빠져나가기 위한 코드가 필요하다
*/

import java.util.Scanner;

public class KeyControl {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);                   //Scanner 생성
         boolean run = true;                                    //while문의 조건식을 위한 변수 선언.
         int speed = 0;

         while (run) {
             System.out.println("-----------------------");
             System.out.println("1. 증속 | 2. 감속 | 3. 중지");
             System.out.println("-----------------------");

             String strNum = sc.nextLine();                     //키보드에 입력한 내용을 읽음.

             if(strNum.equals("1")) {
                 speed++;
                 System.out.println("현재 속도 = " + speed);
             } else if(strNum.equals("2")) {
                 speed--;
                 System.out.println("현재 속도 = " + speed);
             } else if(strNum.equals("3")) {
                 run = false;                                   //while 문의 조건식을 false로 만듬
             }
         }

        System.out.println("프로그램 종료");
    }
}
