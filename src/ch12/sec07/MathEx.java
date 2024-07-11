package ch12.sec07;

/*
 * 장제목 : 12-7 수학 클래스
 * 작성일 : 2024.07.11
 *
 * Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공한다.
 * Math 클래스가 제공하는 메소드는 모두 정적이므로 Math 클래스로 바로 사용이 가능하다.
 */

public class MathEx {
    public static void main(String[] args) {
        //큰 정수 또는 작은 정수 얻기
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("v1 : " + v1);
        System.out.println("v2 : " + v2);

        //큰 값 또는 작은값 얻기
        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("v3 : " + v3);
        System.out.println("v4 : " + v4);

        //소수 이하 두 자리 얻기
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v5 = temp2 / 100;
        System.out.println("v5 : " + v5);
    }
}
