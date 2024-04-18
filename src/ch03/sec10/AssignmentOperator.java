package ch03.sec10;

/*
 * 장제목 : 3-10 대입 연산자
 * 작석일 : 2024.04.18
 *
 * 대입 연산자는 우측 피연산자의 값을 좌측 피연산자인 변수에 대입한다.
 * 우측 피연산자에는 리터널 및 변수, 그리고 다른 연산식이 올 수 있다.
 * 대입 연산자의 종류에는 단순히 값을 대입하는 단순 대입 연산자가 있고, 정해진 연산을 수행한 후 결과를 대입하는 복합 대입 연산자가 있다.
 * */

public class AssignmentOperator {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        System.out.println("result = " + result);
        result -= 5;
        System.out.println("result = " + result);
        result *= 3;
        System.out.println("result = " + result);
        result /= 5;
        System.out.println("result = " + result);
        result %= 3;
        System.out.println("result = " + result);
    }
}
