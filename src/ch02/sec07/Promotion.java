package ch02.sec07;

/*
 * 장제목 : 2-7 자동 타입 변환
 * 작석일 : 2024.04.16
 *
 * 자동 타입 변환은 말 그대로 자동으로 타입 변환이 일어나는 것을 말한다.
 * 자동 타입 변환은 값의 허용 번위가 작은 타입이 허용 범위가 큰 타입ㅇ즈로 대입될 때 발생한다.
 * */

public class Promotion {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 = " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue = " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}
