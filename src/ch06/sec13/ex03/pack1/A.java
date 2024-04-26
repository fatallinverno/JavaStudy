package ch06.sec13.ex03.pack1;

/*
 * 필드와 메소드의 접근 제한
 * 필드와 메소드도 어디에서나 읽고 호출할 수 있는것은 아니고, 어떤 제벅느 제한을 갖느냐에 따라 호출 여부가 결정된다.
 * 필드와 메소드는 public, default, private 접근 제한을 가질 수 있다.
 * */

public class A {
    //public 접근 제한을 갖는 필드 선언
    public int field1;
    //default 접근 제한을 갖는 필드 선언
    int field2;
    //private 접근 제한을 갖는 필드 선언
    private int field3;

    //생성자 선언
    public A(){
        //클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
        field1 = 1; //O
        field2 = 1; //O
        field3 = 1; //O

        method1();  //O
        method2();  //O
        method3();  //O
    }

    //public 접근 제한을 갖는 메소드 선언
    public void method1(){
    }

    //default 접근 제한을 갖는 메소드 선언
    void method2(){
    }

    //private 접근 제한을 갖는 메소드 선언
    private void method3(){}
}
