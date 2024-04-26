package ch06.sec15;

/*
 * 장제목 : 6-15 싱글톤 패턴
 * 작성일 : 2024.04.26
 *
 * 애플리케이션 전체에서 단 한 개의 객체만 생성해서 사용하고 싶다면 싱글톤 패턴을 적용할 수 있다.
 * 싱글톤 패턴의 핵심은 생성자를 private 접근 제한해 외부에서 new 연산자로 생성자를 홏루할 수 없도록 막는것ㅇ디ㅏ.
 * */

public class Singleton {
    //private 접근 권한을 갖는 정적 필드 선언과 초기화
    private static Singleton singleton = new Singleton();

    //private 접근 권한을 갖는 생성자 선언
    private Singleton() {
    }

    //public 접근 권한을 갖는 정적 메소드 선언
    public static Singleton getInstance() {
        return singleton;
    }
}
