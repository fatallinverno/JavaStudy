package ch03.sec05;

/*
 * 장제목 : 3-5 나눗셈 연산 후 NaN과 Infinity 처리
 * 작석일 : 2024.04.17
 *
 * 나눗셈(/) 또는 나머지(5) 연산에서 좌측 피연산자ㅇ가 정수이고 우측 피연산자가 0일 경우 예회(ArithmeticException)가 발생된다.
 * 무한대의 값을 정수로 표현 할 수 없기 때문이다.
 * Infinity(무한대), NaN(Not a Number)
 * */

public class InfinityAndNaNCheck {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        //double z = x % y;

        //잘못된 코드
        System.out.println(z + 2);

        System.out.println("----------------------------------");

        //알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
