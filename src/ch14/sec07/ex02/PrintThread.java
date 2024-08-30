package ch14.sec07.ex02;

/*
 * 장제목 : 14-7 스레드 안전 종료 - interrupt() 메소드 이용
 * 작성일 : 2024.08.30
 *
 * interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때 InterruptedException 예외를 발생시키는 역할을 한다.
 * 이것을 이용하면 예외 처리를 통해 run() 메소드를 정상 종료시킬 수 있다.
 * XThread를 생성해서 start() 메소드를 실행한 후에 XThread의 interrupt() 메소드를 실행하면 XThread가 일시 정지 상태가 될 때 InterruptedException이 발생하여 예외 처리 블록으로 이동한다.
 * 이것은 결국 while문을 빠져나와 자원을 정리하고 스레드가 종료되는 효과를 가져온다.
 */

public class PrintThread extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
