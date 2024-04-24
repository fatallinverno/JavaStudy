package ch06.sec08.ex01;

/*
 * 메소드 호출
 * 메소드를 호출한다는 것은 메소드 블록을 실행하는 것을 말한다.
 * 클래스에서 메소드를 선언했다고 해서 바로 호출할 수 있는 것은 아니다.
 * 메소드는 객체의 동작이므로 객체가 존재하지 않으면 메소드를 호출할 수 없다.
 * */

public class CalculatorEx {
    public static void main(String[] args) {
        //Calculator 객체 생성
        Calculator myCalc = new Calculator();

        //리턴값이 없는 powerOn() 메소드 호출
        myCalc.powerOn();

        //plus 메소드 호출 시 5와 6을 매개값으로 제공하고, 덧셈 결과를 리턴받아 result1 변수에 대입
        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 = " + result1);

        int x = 10;
        int y = 4;
        //divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고, 나눗셈 결과를 리턴받아 result2 변수에 대입
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 = " + result2);

        //리턴값이 없는 powerOff() 메소드를 호출
        myCalc.powerOff();
    }
}
