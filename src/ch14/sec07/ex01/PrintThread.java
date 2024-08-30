package ch14.sec07.ex01;

/*
 * 장제목 : 14-7 스레드 안전 종료
 * 작성일 : 2024.08.30
 *
 * 스레드는 자신의 run() 메소드는 모두 실행되면 자동적으로 종료되지만, 경우에 따라서는 실행 중인 스레드를 즉시 종료할 필요가 있다.
 * 예를 들어 도영ㅇ상을 끝까지 보지 않고 사용자가 몸춤을 요구하는 경우이다.
 * 스레드를 강제 종료시키기 위해 Thread는 stop() 메소드를 제공하고 있으나 이 메소드는 deprecated(더 이상 사용하지 않음) 되었다.
 * 그 이유는 스레드를 갑자기 종료하게 되면 사용 중이던 리소스들이 불안전한 상태로 남겨지기 때문이다.
 * 여기에서 리소스란 파일, 네트워크 연결 등을 말한다.
 * 스레드를 안전하게 종료하는 방법은 사용하던 리소스들을 정리하고 run() 메소드를 빨리 종료하는 것이다.
 * 주로 조건 이용 방법과 interrupt() 메소드 이용 방법을 사용한다.
 */

public class PrintThread extends Thread {
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {                        //stop 필드값에 따라 반복 여부 결정
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");       //리소스 정리
        System.out.println("실행 종료");
    }
}
