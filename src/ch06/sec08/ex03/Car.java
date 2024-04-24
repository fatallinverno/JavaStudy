package ch06.sec08.ex03;

/*
 * return 문
 * return 문은 메소드의 실행을 강제 종료하고 호출한 곳으로 돌아간다는 의미이다.
 * 메소드 선언에 리턴 타입이 있을 경우에는 return 문 뒤에 리턴값을 추가로 지정해야 한다.
 * */

public class Car {
    //필드 선언
    int gas;

    //리턴값이 없ㄴ든 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    //리턴값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
    boolean isLestGas(){
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    //리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드를 종료
    void run() {
        while (true){
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량 : " + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춤니다.(gas잔량 : " + gas + ")");
                return;
            }
        }
    }

}
