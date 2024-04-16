package ch02.sec13;

import java.util.Scanner;

/*
 * 장제목 : 2-13 키보드 입력 데이터를 변수에 저장
 * 작석일 : 2024.04.16
 *
 * 키보드로부터 입력된 데이터를 읽고 변수에 저장하는 가장 쉬운 방법은 Scanner를 사용하는 것이다.
 * Scanner 타입 변수를 선언하고, 대입 연사자를 = 를 사용해서 new 연산자로 생성한 Scanner 객체에 대입한다.
 * */

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while(true){
            System.out.println("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();

        }

        System.out.println("종료");
    }
}
