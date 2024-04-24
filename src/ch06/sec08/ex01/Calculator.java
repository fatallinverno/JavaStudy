package ch06.sec08.ex01;

/*
 * 장제목 : 6-8 메소드 선언과 호출
 * 작석일 : 2024.04.24
 *
 * 메소드 선언은 객체의 동작을 실행 블록으로 정의한느 것을 말하고, 메소드 호출은 실행 블록을 실제로 실행하는 것을 말한다.
 * 메소드는 객체 내부에서도 호출되지만 다른 객체에서도 호출될 수 있기 때문에 객체 간의 상호작용 방법을 정의하는 것이라고 볼 수 있다.
 * */

public class Calculator {
    //리턴값이 없는 메소드 선언
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }

    //리턴값이 없는 메소드 선언
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    //호출 시 두 정수 값을 전달받고, 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    //호출 시 두 정수 값을 전달받고, 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    double divide(int x, int y){
        double result = (double) x / y;
        return result;
    }
}
