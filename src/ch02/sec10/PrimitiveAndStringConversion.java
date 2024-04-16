package ch02.sec10;

/*
 * 장제목 : 2-10 문자열을 기본 타입으로 변환
 * 작석일 : 2024.04.16
 *
 * valueOf 메소드는 boolean, char, int  같은 다양한 타입의 값을 문자열로 변환해주는 메소드
 * */

public class PrimitiveAndStringConversion {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
