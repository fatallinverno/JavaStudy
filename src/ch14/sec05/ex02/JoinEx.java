package ch14.sec05.ex02;

/*
 * 장제목 : 14-5 스레드 상태 - 다른 스레드의 종료를 기다림
 * 작성일 : 2024.08.29
 *
 * 스레드는 다른 스레드와 독립적으로 실행하지만 다른 스레드가 종료될 때까지 기다렸다가 실행을 해야 하는 경우도 있다.
 * 예를 들어 계산 스레드의 작업이 종료된 후 그 결과값을 받아 처리하는 경우이다.
 * 이를 위해 스레드는 join() 메소드를 제공한다.
 */

public class JoinEx {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
        }
        System.out.println("1~100 합 : " + sumThread.getSum());
    }
}
