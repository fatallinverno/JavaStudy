package ch04.sec03;

/*
case 끝에 있는 break는 다음 case를 실행하지 않고 switch 문을 빠져나가기 위해 필요하다.
만약 break가 없다면 다음 case가 연달아 실행되는데, 이때는 case 값과는 상관없이 실행된다.
*/

public class SwitchNoBreakCase {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4) + 8;
        System.out.println("[현재시간 : " + time + "시]");

        switch (time){
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
