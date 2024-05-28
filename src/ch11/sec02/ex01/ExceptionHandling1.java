package ch11.sec02.ex01;

public class ExceptionHandling1 {
    public static void printLength(String data) {
        int result = data.length();     //data가 null일 경우 NullPointException 발생
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("This is Java");
        printLength(null);         // 매개값으로 null을 대입
        System.out.println("[프로그램 종료]");
    }
}
