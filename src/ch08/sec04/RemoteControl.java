package ch08.sec04;

/*
 * 장제목 : 8-4 추상 메소드
 * 작성일 : 2024.05.10
 *
 * 인터페이스는 구현 클래스가 재정의해야 하는 public 추상 메소드 멤버로 가질 수 있다.
 * 추상 메소드는 리턴 타입, 메소드명, 매개변수만 기술되고 중괄호 {}를 붙이지 않는 메소드를 말한다.
 * public abstract를 생략하더라도 컴파일 과정에서 자동으로 붙게된다.
 * */

public interface RemoteControl {
    //상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
