package ch02.sec02;

/*
 * 장제목 : 2-2 정수타입
 * 작성일 : 2024.04.15
 *
 * 변수는 선언될 때의 타입에 따라 저장할 수 있는 값의 종류와 허용 범위가 달라진다.
 * 자바는 정수, 실수, 논리값을 저장할 수 있는 기본 타입 8개를 다음과 같이 제공한다.
 *
 * 정수 = byte, char, short, int, long
 * 실수 = flost, double
 * 논리(true/false) = boolean
 * */

public class IntegerLiteral {

    public static void main(String[] args) {

        int var1 = 0b1011;     //2진수
        int var2 = 0206;       //8진수
        int var3 = 365;        //10진수
        int var4 = 0xB3;       //16진수

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);

    }

}
