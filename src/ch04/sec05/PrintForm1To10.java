package ch04.sec05;

/*
 * 장제목 : 4-5 while 문
 * 작석일 : 2024.04.19
 *
 * for 문을 정해진 횟수만큼 반복한다면, while 문은 조건식이 true일 경우에 계속해서 반복하고, false가 되면 반복을 멈추고 while 문을 종료한다.
 * */

public class PrintForm1To10 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " ");
            i++;
        }
    }
}
