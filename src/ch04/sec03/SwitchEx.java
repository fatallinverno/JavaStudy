package ch04.sec03;

/*
 * 장제목 : 4-3 switch 문
 * 작석일 : 2024.04.18
 *
 * if문은 조건식의 결과가 true, flase 두 가지밖에 없기 때문에 경우의 수가 많아질수록 else if를 반복적으로 추가해야 하므로 코드가 복잡해진다.
 * switch 문은 변수의 값에 따라 실행문이 결정되기 때문에 같은 기능의 if 문보다 코드가 간결해진다.
 * */

public class SwitchEx {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) + 1;

        switch (num) {
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:
                System.out.println("6번이 나왔습니다.");
        }
    }
}
