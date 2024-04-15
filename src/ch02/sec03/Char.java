package ch02.sec03;

/*
 * 장제목 : 2-3 문자타입
 * 작성일 : 2024.04.15
 *
 * 하나의 문자를 작은따옴표(')로 감싼 것을 문자 리터럴이라고 한다.
 * 문자 리터럴은 유니코드로 변환되어 저장되는데, 유니코드는 세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약이다.
 * */

public class Char {
    public static void main(String[] args) {
        char c1 = 'A';      //문자 저장
        char c2 = 65;       //유니코드 직접 저장
        
        char c3 = '가';      //문자 저장
        char c4 = 44032;    //유니코드 직접 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
