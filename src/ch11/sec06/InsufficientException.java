package ch11.sec06;

/*
 * 장제목 : 11-6 사용자 정의 예외
 * 작성일 : 2024.05.28
 *
 * 은행의 뱅킹 프로그램에서 잔고보다 더 많은 출금 요청이 들어온 경우에는 잔고 부족 예외를 발생시킬 필요가 있다.
 * 그러나 잔고 부족 예외는 표준 라이브러리에는 존재하지 않기 때문에 직접 예외 클래스를 정의해서 사용해야 한다.
 * 이것을 사용자 정의 예외라고 한다.
 *
 * 사용자 정의 예외
 * 사용자 정의 예외는 컴파일러가 체크하는 일반 예외로 선언할 수도 있고, 컴파일러가 체크하지 않는 실행 예외로 선언할 수도 있다.
 * 통상적으로 일반 예외는 Exception의 자식 클래스로 선언하고, 실행 예외는 RuntimeException의 자식 클래스로 선언한다.
 */

public class InsufficientException extends Exception {
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
