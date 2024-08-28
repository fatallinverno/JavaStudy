package ch13.sec04;

/*
 * 장제목 : 13-4 제한된 타입 파라미터
 * 작성일 : 2024.08.28
 *
 * 경우에 따라서는 타입 파라미터를 대체하는 구체적인 타입을 제한할 필요가 있다.
 * 예를 들어 숫자를 연산하는 제네릭 메소든느 대체 타입으로 Number 또는 자식 클래스(Byte, Short, Integer, Long, Double)로 제한할 필요가 있다.
 * 이처럼 모든 타입으로 대체할 수 없고, 특정 타입과 자식 또는 구현 ㄱ3ㅘㄴ계에 있는 타입만 대체할 수 있는 타입 파라미터를 제한된 타입 파라미터라고 한다.
 */

public class GenericEx {
    //제한된 타입 파라미터를 갖는 제네릭 메소드
    public static <T extends Number> boolean compare(T t1, T t2) {
        //T의 타입을 출력
        System.out.println("compare(" + t1.getClass().getSimpleName() + ", " + t2.getClass().getSimpleName() + ")");

        //Number의 메소드 사용
        double v1 = t1.doubleValue();   //Number 타입의 doubleValue() 메소드 호출
        double v2 = t2.doubleValue();   //Number 타입의 doubleValue() 메소드 호출

        return (v1 == v2);
    }

    public static void main(String[] args) {
        //제네릭 메소드 호출
        boolean result1 = compare(10, 20);
        System.out.println(result1);
        System.out.println();

        //제네릭 메소드 호출
        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }
}
