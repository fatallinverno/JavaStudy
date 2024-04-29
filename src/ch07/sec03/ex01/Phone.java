package ch07.sec03.ex01;

/*
 * 장제목 : 7-3 부모 생성자 호출
 * 작성일 : 2024.04.29
 *
 * 현실에서 부모 없는자식이 있을 수 없듯이 자바에서도 자식 객체를 생성하면 부모 객체가 먼저 생성된 다음에 자식 객체가 생성된다.
 * */

public class Phone {
    //필드 선언
    public String model;
    public String color;

    //기본 생성자 선언
    public Phone(){
        System.out.println("Phone() 생성자 실행");
    }
}
