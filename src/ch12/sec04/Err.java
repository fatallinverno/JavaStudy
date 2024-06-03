package ch12.sec04;

/*
 * 장제목 : 12-4 System 클래스
 * 작성일 : 2024.06.03
 *
 * 자바 프로그램은 운영체제상에서 바로 실행되는 것이 아니라 자바 가상 머신(JVM) 위에서 실행된다.
 * 운영채ㅔ제의 모든 기능을 자바 코드로 직접 접근하기란 어렵다.
 * java.lang. .패키지에 속하는 System 클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.
 * System 클래스의 정적필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터) 출력, 현재 시간 읽기, 시스템 프로퍼티 읽기 등이 가능하다.
 */

public class Err {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("1oo");
        } catch (NumberFormatException e) {
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
    }
}
