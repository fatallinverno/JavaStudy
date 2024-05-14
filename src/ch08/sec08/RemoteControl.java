package ch08.sec08;

/*
 * 장제목 : 8-8 다중 인터페이스 구현
 * 작성일 : 2024.05.13
 *
 * 구현 객체는 여러 개의 인터페이스를 implements할 수 있다.
 * 구현 객체가 인터페이스 A와 인터페이스 B를 구현하고 있다면 각각의 인터페이스를 통해 구현 객체를 사용할 수 있다.
 *  * */


public interface RemoteControl {
    //추상 메소드
    void turnOn();
    void turnOff();
}
