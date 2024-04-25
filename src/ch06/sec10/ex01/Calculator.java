package ch06.sec10.ex01;

/*
 * 장제목 : 6-10 정적 멤버
 * 작성일 : 2024.04.25
 *
 * 자바는 클래스 로더를 이용해서 클래스를 메소드 영역에 저장하고 사용한다.
 * 정적 멤버란 메소드 영역의 클래스에 고정적으로 위치하는 멤버를 말한다.
 * 그렇기 때문에 정적 멤버는 객체를 생성 할 필요 없이 클래스를 통해 바로 사용이 가능하다.
 * */

public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}
