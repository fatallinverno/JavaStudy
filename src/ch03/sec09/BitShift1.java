package ch03.sec09;

/*
 * 장제목 : 3-9 비트 이동 연산자
 * 작석일 : 2024.04.18
 *
 * 비트 연산자에는 논리 연산자 외에도 이동 연산자가 있다.
 * 비트 이동 연산자는 비트를 좌측 또는 우측으로 밀어서 이동시키는 연산을 수행한다.
 * */

public class BitShift1 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3;
        int result2 = num1 * (int) Math.pow(2, 3);      //Math.pow(2,3)은 2의 3승을 연산하고 double 값을 산출한다. int 값으로 얻고 싶다면 (int)로 캐스팅해야 한다.
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}
