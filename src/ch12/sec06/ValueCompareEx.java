package ch12.sec06;

/*
* 문자열을 기본 타입 값으로 변환
* 포장클래스는 문자열을 기본 타입 값으로 변환할 때도 사용된다.
* 대부분의 포장 클래스에는 'parse + 기본타입' 명으로 되어있는 정적 메소드가 있다.
*
* 포장 값 비교
* 포장 객체는 내부 값을 비교하기 위해 ==와 != 연산자를 사용할 수 없다.
* 이 연산자는 내부의 값을 비교하는 것이 아니라 포장 객체의 번지를 비교하기 때문이다.
* 포장 객체에 정확히 어떤 값이 저장될 지 모르는 상황이라면 ==과 !=은 사용하지 않는 것이 좋다.
* 대신 equals() 메소드로 내부 값을 비교할 수 있다.
* */

public class ValueCompareEx {
    public static void main(String[] args) {
        //-128 ~ 127 초과값일 경우
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("== : " + (obj1 == obj2));
        System.out.println("equals() : " + (obj1.equals(obj2)));

        System.out.println();

        //-128 ~ 127 범위값일 경우
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("== : " + (obj3 == obj4));
        System.out.println("equals() : " + (obj3.equals(obj4)));
    }
}
