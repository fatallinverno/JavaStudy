package ch11.sec02.ex02;

public class ExceptionHandling2 {
    public static void printLength(String data) {
        try {
            int result = data.length();     //data가 null일 경우 NullPointException 발생
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException e) {
            //예외 정보를 얻는 3가지 방법
            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//            e.printStackTrace();
        } finally {
            System.out.println("[마무리 실행]\n");
        }

    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("This is Java");
        printLength(null);         // 매개값으로 null을 대입
        System.out.println("[프로그램 종료]");
    }
}
