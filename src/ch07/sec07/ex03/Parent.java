package ch07.sec07.ex03;

/*
* 강제 타입 변환
* 자식 타입은 부모 타입으로 자동 변환되지만 바ㅣㄴ대로 부모 타입은 자식 타입으로 자동 변환되지 않는다.
* 캐스팅 연산자로 강제 타입 변환을 할 수 있다.
* 부모 타입 객체를 자식 타입으로 무조건 강제 변환할 수 있는 것은 아니다.
* 자식 객체가 부모 타입으로 자동 변환된 후 다시ㅑ 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있다.
* 자식 객체가 부모 차입으로 자동 변환하면 부모 타입에 선언된 필드와 메소드만 사용 가능하다는 제약 사항이 따른다.
* 만약 자식 타입에 선언된 필드와 메소드를 꼭 사용해야 한다면 강제 타입 ㅂ변환을 해서 다시 자식 타입으로 변환해야 한다.
* */

public class Parent {
    //필드 선언
    public String field1;

    //메소드 선언
    public void method1(){
        System.out.println("Parent.method1()");
    }

    //메소드 선언
    public void method2(){
        System.out.println("Parent.method2()");
    }
}
