package ch11.sec05;

/*
 * 장제목 : 11-5 예외 떠넘기기
 * 작성일 : 2024.05.28
 *
 * 메소드 내부에서 예외가 발생할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만, 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다.
 * 이때 사용하는 키워드가 throws이다. throws는 메소드 선언부 끝에 작성하는데, 떠넘길 예외 클래스를 쉼표로 구분해서 나열해 주면 된다.
 */

public class Throws1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리 : " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
