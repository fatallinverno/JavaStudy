package ch05.sec05;

/*
 * 장제목 : 5-5 문자열(String) 타입
 * 작석일 : 2024.04.22
 *
 * 문자열 비교
 * 자바의 문자열은 String 객체로 생성된다.
 * 두 개의 String 변수 name과 hobby를 선언하고 문자열 리터럴을 대입한 것이다.
 * name 변수와 hobby 변수에 문자열 리터널이 대입되면 문자열은 String 객체로 생성되고, 객체의 번지가 각각 대입된다.
 * */

public class EqualsEx {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String stdVar3 = new String("홍길동");
        String stdVar4 = new String("홍길동");

        if(stdVar3 == stdVar4){
            System.out.println("stdVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("stdVar3과 stdVar4는 참조가 다름");
        }

        if(stdVar3.equals(stdVar4)){
            System.out.println("stdVar3과 stdVar4는 문자열이 같음");
        }
    }
}
