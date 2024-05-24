package ch09.sec05.ex02;

/*
* 바깥 클래스의 객체 접근
* 중첩 클래스 내부에서 this는 해당 중첩 클래스이 객체를 말한다.
* 만약 중첩 클래스 내부에서 바깥 클래싕 객체를 얻으려면 바깥 클래스 이름에 this를 붙여 주면 된다.
* */

public class A {
    //A 인스턴스 필드
    String field = "A-field";

    //A 인스턴스 메소드
    void method() {
        System.out.println("A-method");
    }

    //인스턴스 멤버 클래스
    class B {
        //B 인스턴스 필드
        String field = "B-field";

        //B 인스턴스 메소드
        void method() {
            System.out.println("B-method");
        }

        //B 인스턴스 메소드
        void print() {
            //B 객체의 필드와 메소드 사용
            System.out.println(this.field);
            this.method();

            //A 객체의 필드와 메소드 사용
            System.out.println(A.this.field);
            this.method();
        }
    }

    //A의 인스턴스 메소드
    void useB() {
        B b = new B();
        b.print();
    }
}
