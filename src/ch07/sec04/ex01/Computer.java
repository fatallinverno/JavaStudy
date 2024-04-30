package ch07.sec04.ex01;

public class Computer extends Calculator {
    //메소드 오버라이딩
    @Override   //컴파일 시 정홗히 오버라이딩이 되었는지 체크해 줌
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
