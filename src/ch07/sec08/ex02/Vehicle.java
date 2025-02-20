package ch07.sec08.ex02;

/*
 * 매개변수 다형성
 * 다형성은 필드보다는 메소드를 호출할 때 많이 발생한다.
 * 메소드가 클래스 타입의 매개변수를 가지고 있을 경우, 호출할 때 동일한 타입의 객체를 제공하는 것이 정석이지만 자식 객체를 제공할 수도 있다.
 * 여기서 다형성이 발생한다.
 * */

public class Vehicle {
    //메소드 선언
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}
