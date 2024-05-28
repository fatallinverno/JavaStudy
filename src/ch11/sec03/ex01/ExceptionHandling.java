package ch11.sec03.ex01;

/*
 * 장제목 : 11-3 예외 종류에 따른 처리
 * 작성일 : 2024.05.27
 *
 * try 블록에는 다양한 종류의 예ㄹ외가 발생할 수 있다.
 * 이 경우 다중 catch를 사용하면 발생하는 예외에 따라 예외 처리 코드를 다르게 작성할 수 있다.
 * catch 블록의 예외 클래스는 try 블록에서 발생된 예외의 종류를 말하는데, 해당 타입의 예외가 발생하면 catch 블록이 선택되어 실행된다.
 */

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
            }
        }
    }
}
