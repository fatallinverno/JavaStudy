package ch05.sec05;

/*
 * 장제목 : 5-5 문자열(String) 타입
 * 작석일 : 2024.04.22
 *
 * 문자열 잘라내기
 * 문자열에서 특정 위치의 문자열을 잘라내어 가져공고 싶다면 substring() 메소드를 사용한다.
 * */

public class SubString {
    public static void main(String[] args) {
        String ssn = "881109-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
