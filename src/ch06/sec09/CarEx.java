package ch06.sec09;

/*
* this 키워드
* 객체 내부에서는 인스턴스 멤버에 접근하기 위해 this를 사용할 수 있다.
* 우리가 자신을 '나'라고 하고듯이, 객체는 자신을 'this'라고 한다.
* 생성자와 메소드의 매개변수명이 인스턴스 멤버인 필드명과 동일한 경우, 인스턴스 필드임을 강조하고자 할 때 this를 주로 사용한다.
* */

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("페라리");

        myCar.drive();
        yourCar.drive();
    }
}
