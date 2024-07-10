package ch12.sec06;

/*
 * 장제목 : 12-6 포장클래스
 * 작성일 : 2024.07.10
 *
 * 자바는 기본타입(byte, char, short, int, long, float, double, boolean)의 값을 갖는 객체를 생성할 수 있다.
 * 이런 객체를 포장 객체라고 한다.
 * 값을 포장하고 있다고 해서 붙여진 이름이다.
 * 포장 객체를 생성하기 윟나 클래스는 java.lang 패키지에 포함되어 있는데, char타입과 int타입이 각각 Character와 Integer인 것만 제외하고는 기본 타입의 첫 문자를 대문자로 바꾼 이름을 가지고 있다.
 *
 * 박싱과 언박싱
 * 기본 타입의 값을 포장 객체로 만드는 과정을 박싱이라고 하고, 반대로 포장 객체에서 기본 타입의 값을 얻어내는 과정을 언박싱 이라고 한다.
 * 박싱은 포장 클래스 변수에 기본 타입 값이 대입될 때 발생한다.
 * 언박싱은 기본 타입 변수에 포장 객체가대입될 때 발생한다.
 */

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        //Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        //Unboxing
        int value = obj;
        System.out.println("value : " + value);

        //연산 시 Unboxing
        int result = obj + 100;
        System.out.println("result : " + result);
    }
}
