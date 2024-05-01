package ch07.sec06.pack2;

import ch07.sec06.pack1.A;

public class D extends A {
    private String field;

    //생성자 선언
    public D(){
        //A() 생성자 호출
        super();
    }

    //메소드 선언
    public void method1(){
        //A 필드값 변경
        this.field = "value";
        //메소드 호출
        this.method();
    }

    //메소드 선언
    public void method2(){
        A a = new A();      //X
        a.field = "value";  //X
        a.method();         //X
    }
}
