package ch02.sec05;

/*
* 장제목 : 2-5 논리 타입
* 작석일 : 2024.04.15
*
* 참과 거짓을 의미하는 논리 리터널은 true와 false이다
* boolean 타입 변수는 주로 두 가지 상태값을 저장할 필요가 있을 경우에 사용되며, 상태값에 따라 ㅈ도건문과 제어문의 실행 흐름을 변경하는 데 사용된다.
* */

public class Boolean {

    public static void main(String[] args) {

        boolean stop = true;
        if(stop){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int x = 10;
        boolean result1 = (x == 20);    //변수 x의 값이 20인가?
        boolean result2 = (x != 20);    //변수 x의 값이 20이 아닌가?
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }

}
