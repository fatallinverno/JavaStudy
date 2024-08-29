package ch14.sec05.ex03;

/*
 * 장제목 : 14-5 스레드 상태 - 다른 스레드에게 실행 양보
 * 작성일 : 2024.08.29
 *
 * 스레드가 처리하는 작업은 반복적인 실행을 위해 for 문이나 while 문을 포함하는 경우가 많은데, 가끔 반복문이 무의미한 반복을 하는 경우가 있다.
 */

public class YieldEx {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("workThreadA");
        WorkThread workThreadB = new WorkThread("workThreadB");
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        workThreadA.work = false;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        workThreadA.work = true;
    }
}
