package ch03.sec01;

/*
 * 장제목 : 3-1 부호/증감 연산자
 * 작석일 : 2024.04.17
 *
 * 증감 연산자(++, --)는 변수의 값을 1 증가시키거나 1 감소시키는 연산자이다.
 * */

public class SignOperator {
    public static void main(String[] args) {
        int x = -100;
        x = -x;
        System.out.println("x = " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y = " + y);
    }
}
