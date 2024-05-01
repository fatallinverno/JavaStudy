package ch07.sec06.pack1;

public class B {
    //메소드 선언
    public void method(){
        A a = new A();      //O
        a.field = "value";  //O
        a.method();         //O
    }
}
