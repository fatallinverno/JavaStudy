package ch07.sec07.ex01;

/*
 * 장제목 : 7-7 타입변환
 * 작성일 : 2024.05.01
 *
 * 타입 변환이란 타입을 다른 타입으로 변환하는 것을 말한다.
 * 클래스도 마찬가지로타입 변환이 있는데, 클래스의 타입 변환은 상속 관계에 있는 클래스 사이에서 발생한다.
 *
 * 자동 타입 변환
 * 자동 타입 변환은 의미 그대로 자동적으로 타입 변환이 일어나는 것을 말한다.
 * 자식은 부모의 특징과 기능을 상속받기 때문에 부모와 동일하게 취급될 수 있다.
 * 예를들어 고양이가 동물의 특징고ㅓㅏ 기능을 상속받았다면 '고양이는 동물이다'가 성립된다.
 * */

class A{
}

class B extends A{
}

class C extends A{
}

class D extends B{
}

class E extends C{
}

public class Promotion {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //자동 타입 변환
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        //컴파일 에러(상속 관계에 있지 않음)
        //B b3 = e;
        //C c2 = d;

    }

}
