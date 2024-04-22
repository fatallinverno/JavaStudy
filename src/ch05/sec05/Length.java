package ch05.sec05;

/*
 * 장제목 : 5-5 문자열(String) 타입
 * 작석일 : 2024.04.22
 *
 * 문자 길이
 * 문자열에서 문자의 개수를 얻고 싶다면 length() 메소드를 이용해보자.
 * */

public class Length {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        int length = ssn.length();
        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }
}
