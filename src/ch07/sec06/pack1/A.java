package ch07.sec06.pack1;

/*
 * 장제목 : 7-6 protected 접근 제한자
 * 작성일 : 2024.05.01
 *
 * public, private 접근 제한자를 사용해 객체 외부에서 필드, 생성자, 메소드의 접근 여부를 결정했다.
 * 이번 절에서는 또 하나의 접근 제한자인 protected에 대해 알아본다
 * protected는 상속과 관련이 있고, public과 default의 중간쯤에 해당하는 접근 제한을 한다.
 * protected는 같은 패키지에서는 default처럼 접근이 가낭하나, 다른 패키지에서는 자식 클래스만 접근을 허용한다.
 * protected는 필드와 생성자 그리고 메소드 선언에 사용될 수 있다.
 * */

public class A {
    //필드 선언
    protected String field;

    //생성자 선언
    protected A(){
    }

    //메소드 선언
    protected void method(){
    }
}
