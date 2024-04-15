package ch02.sec01;

/*
 * 장제목 : 2-1 변수 선언
 * 작성일 : 2024.04.15
 * */

public class VariableExchange {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        System.out.println("x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }

}
