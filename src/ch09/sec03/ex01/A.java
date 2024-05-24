package ch09.sec03.ex01;

/*
 * 장제목 : 9-3 정적 멤버 클래스
 * 작성일 : 2024.05.24
 */

public class A {
    //정적 멤머 클래스
    static class B {}

    //인스턴스 필드값으로 B 객체 대입
    B field1 = new B();

    //정적 필드값으로 B 객체 대입
    static B field2 = new B();

    //생성자
    A(){
        B b = new B();
    }

    //인스턴스 메소드
    void method1(){
        B b = new B();
    }

    //정적 메소드
    static void method2(){
        B b = new B();
    }
}
