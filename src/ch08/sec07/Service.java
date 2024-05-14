package ch08.sec07;

/*
 * 장제목 : 8-7 private 메소드
 * 작성일 : 2024.05.14
 *
 * 인터페이스의 상수 필드, 추상 메소드, 디폴트 메소드, 정적 메소드는 모두 public 접근 제한을 갖는다.
 * 이 멤버들ㅇㄹ 선언할 떄에는 public을 생략하더라도 컴파일 과정에서 public 접근 제한자가 붙어 항상 외부에서 접근이 가능하다.
 * 또한 인터페이스에 외부에서 접근할 수 없는 private 메소드 선언도 가능하다.
 * private 메소드는 디폴트 메소드 안에서만 호출이 가능한 반면, private 정적 메소드는 디폴트 메소드뿐만 아니라 정적 메소드 안에서도 호출이 가능하다.
 * private 메소드의 용도는 디폴트와 정적 메소드들의 중복 코드를 줄이기 위함이다.
 * */

public interface Service {
    //디폴트 메소드
    default void defaultMethod1(){
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    //private 메소드
    private void defaultCommon(){
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    //private 정적 메소드
    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }

}
