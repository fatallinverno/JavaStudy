package ch03.sec08;

/*
 * 장제목 : 3-8 비트 논리 연산자
 * 작석일 : 2024.04.18
 *
 * 비트 논리 연산자는 bit 단위로 ㄴ온리 연산을 수행한다.
 * 0과 1이 피연산자가 되므로 2진수 0과 1로 저장되는 정수 타입(byte, short, int ,long)만 피연산자가 될 수 있고
 부동 소수점 방식으로 저장 되는 실수 타입(flaot, double)은 피연산자가 될 수 없다.
 * */

public class BitLogic {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("-----------------------------");

        byte receiveData = -120;

        //방법 1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        //방법 2 : 자바 API를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 =Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
