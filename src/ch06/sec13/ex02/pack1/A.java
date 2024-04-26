package ch06.sec13.ex02.pack1;

/*
 * 생성자의 접근 제한
 * 객체를 생성하기 위해 생성자를 어디에서나 호출 할 수 있는 것은 아니다.
 * 생성자가 어떤 접근 제한을 갖느냐에 따라 호출 가능 여부가 결정된다.
 * 생성자는 public, default, private 접근 제한을 가질 수 있다.
 * */

public class A {
    //필드 선언
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    //public 접근 제한 생성자 선언
    public A(boolean b){
    }

    //default 접근 제한 생성자 선언
    A(int b){
    }

    //private 접근 제한 생성자 선언
    private A(String s){
    }
}
