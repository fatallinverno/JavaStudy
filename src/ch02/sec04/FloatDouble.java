package ch02.sec04;

/*
* 장제목 : 2-4 실수 타입
* 작석일 : 2024.04.15
*
* float 타입과 double 타입은 가수와 지수를 저장하기 위해 전체 bit를 다음과 같이 나누어 사용
* float = 1bit 지수(8bit) 가수(23bit)
* double = 1bit 지수(11bit) 가수(52bit)
* 최상위 1bit는 양수 및 음수를 결정짓는 부호 bit로 0이면 양수, 1이면 음수가 된다.
* */

public class FloatDouble {
    public static void main(String[] args) {
        //정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        //10의 거듭제곱 리터널
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}
