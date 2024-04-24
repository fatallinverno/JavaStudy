package ch05.sec11;

/*
 * 장제목 : 5-11 main() 메소드의 String[] 매개변수 용도
 * 작석일 : 2024.04.24
 *
 * 자바 프로그램을 실행하기 위해 지금까지 main() 메소드를 작성했는데, 여기에서 문자열 배열 형태인 String[] args 매개변수가 왜 필요한지 알아보자.
 * 윈도우의 명령 프롬프트나 MacOS의 터ㅣ널에서 프로그램을 실행할 때는 요구하는 값이 있을 수 있다.
 * */

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length != 2) {                              //입력된 데이터가 개수가 두 개가 아닐 경우
            System.out.println("프로그램 입력값이 부족");
            System.exit(0);                           //프로그램 강제 종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
