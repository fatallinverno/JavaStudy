package ch07.sec04.ex01;

/*
 * 장제목 : 7-4 메소드 재정의
 * 작성일 : 2024.04.30
 *
 * 부모 클래스의 모든 메소드가 자식 클래스에게 맞게 설계되어 있다면 가장 이상적인 상속이지만, 어떤 메소드는 자식 클래스가 사용하기에 적합하지 않을 수 있다.
 * 이러한 메소드는 자식 클래스에서 재정의해서 사용해ㅔ야 한다.
 * 이것을 메소드 오버라이딩이라고 한다.
 *
 * 메소드 오버라이딩
 * 메소드 오버라이딩은 상속된 메[소드를 자식 클래스에서 재정의하는 것을 말한다.
 * 메소드가 오버라이딩 되었다면 해당 부모 메소드는 숨겨지고, 자식 메소드가 우선적으로 사용된다.
 * */

public class Calculator {
    //메소드 선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }
}
