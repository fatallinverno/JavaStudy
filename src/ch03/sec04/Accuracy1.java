package ch03.sec04;

/*
 * 장제목 : 3-4 정확한 계산은 정수 연산으로
 * 작석일 : 2024.04.17
 *
 * 산순 연산을 정확하게 계산하고 싶다면 실수 타입을 사용하지 않는 것이 좋다.
 * */

public class Accuracy1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양 : " + result);
    }
}
