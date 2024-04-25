package ch06.sec09;

/*
 * 장제목 : 6-9 인스턴스 맴버
 * 작석일 : 2024.04.25
 *
 * 필드와 메소드는 선언 방법에 따라 인스턴스 맴버와 정적 멤버로 분류할 수 있다.
 * 인스턴스 멤버로 선언되면 객체 생성 후 사용할 수 있고, 정적 멤버로 선언되면 객체 생성 없이도 사용할 수 있다.
 * 인스턴스 멤버란 객체에 소속된 멤버를 말한다.
 * 따라서 객체가 있어야만 사용할 수 있는 멤버다
 * 지금까지 선언한 필드와 메소드는 인스턴스 멤버이다
 * */

public class Car {
    //필드 선언
    String model;
    int speed;

    //생성자 선언
    Car(String model){
        this.model = model; //매개변수를 필드에 대입(this 생략 불가)
    }

    //메소드 선언
    void setSpeed(int speed){
        this.speed = speed; //매개변수를 필드에 대입(this 생략 불가)
    }

    void drive(){
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "hm/h)");
    }
}
