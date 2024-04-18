package ch04.sec03;

/*
switch 문의 괄호에는 정수 타입(byte, char, short, int, long)과 문자열 타입(String) 변수를 사용할 수 있다.
*/

public class SwitchChar {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");

        }
    }
}
