package ch06.sec08.ex04;

/*
 * 메소드 오버로딩
 * 메소드 오버로딩은 메소드 이름은 같되 매개변수ㅡ의 타입, 개수, 순서가 다른 메소드를 여ㅑ러개 선언하는 것을 말한다.
 * 메소드 오버리동의 목적은 다양한 매개값을 처리하기 위해서이다.
 * */

public class Calculator {
    //정사각형의 ㄴ럽이
    double areaRectangle(double width){
        return width * width;
    }

    //직사각형의 넓이
    double areaRectangle(double width, double height){
        return width * height;
    }
}
