package ch03.sec11;

/*
 * 장제목 : 3-11 삼항 연산자
 * 작석일 : 2024.04.18
 *
 * 삼항 연산자(피연산자 ? 피연산자 : 피연산자)는 총 3개의 피연산자를 가진다.
 * ? 앞의 피연산자에는 boolean 변수 또는 조건식이 오므로 조건 연산자라고도 한다.
 * 이 값이 true이면 콜론(:) 앞의 피연산자가 선택되고, false이면 콜론 뒤의 피연산자가 선택된다.
 * */

public class ConditionalOperator {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
