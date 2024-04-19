package ch04.sec06;

/*
 * 장제목 : 4-6 do-while 문
 * 작석일 : 2024.04.19
 *
 * do-while 문은 조건식에 의해 반복 실행한다는 점에서는 while 문과 동일하다.
 * while 문은 시작할 때부터 조건식을 편가하여 블록 내부를 실행할지 결정하지만, 경우에 따라서는 블록 내부를 먼저 실행시키고,
 실행 결과에 따라서 반복 실행을 계속할지 결정하는 경우도 있다.
 * */

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do{
            System.out.print(">");
            inputString = sc.nextLine();
            System.out.println(inputString);
        } while(!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료.");
    }
}
