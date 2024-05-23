package ch09.sec02.ex01;

/*
 * 장제목 : 9-2 인터페이스 맴버 클래스
 * 작성일 : 2024.05.23
 */

public class A {
    //인스턴스 멤버 클래스
    class B {}

    //인스턴스 필드값으로 B 객체 대입
    B filed = new B();

    //생성자
    A() {
        B b = new B();
    }

    //인스턴스 메소드
    void method(){
        B b = new B();
    }
}
