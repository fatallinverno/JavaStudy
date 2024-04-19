package ch04.sec07;

/*
 * 장제목 : 4-7 break 문
 * 작석일 : 2024.04.19
 *
 * break 문은 반복문인 for 문, while 문, do-while 문을 실행 중지하거나 조건문인 switch 문을 종료할 때 사용한다.
 * */

public class BreakEx {
    public static void main(String[] args) {
        while(true) {
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료.");
    }
}
