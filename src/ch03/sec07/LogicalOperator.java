package ch03.sec07;

/*
 * 장제목 : 3-7 논리 연산자
 * 작석일 : 2024.04.17
 *
 * 논리 연산자는 논리곱(&&), 논리합(||), 배타적 논리합(^) 그리고 논리 부정(!) 연산을 수행한다.
 * 논리 연산은 흐름 제어문인 조건문(if), 반복문(for, while)에서 실행 흐름을 제어할 때 주로 사용된다.
 * */

public class LogicalOperator {
    public static void main(String[] args) {
        int charCode = 'A';

        if((65<=charCode) & (charCode<=90)){
            System.out.println("대문자이군요");
        }

        if((97<=charCode) && (charCode<=122)){
            System.out.println("소문자이군요");
        }
        
        if((48<=charCode) && (charCode<=57)){
            System.out.println("0~9 숫자이군요");
        }

        int value = 6;

        if((value%2==0) || (value%3==0)){
            System.out.println("2 또는 3의 배수이군요");
        }

        boolean result = (value%2==0) || (value%3==0);
        if(!result){
            System.out.println("2 또는 3의 배수가 아니군요");
        }
    }
}
