package ch14.sec05.ex01;

/*
 * 장제목 : 14-5 스레드 상태
 * 작성일 : 2024.08.29
 *
 * 스레드 객체를 생성하고, start() 메소드를 호출하면 곧바로 스레드가 실행되는 것이 아니라 실행 대기 상태(Runnable)가 된다.
 * 실행 대기 상태란 실행을 기다리고 있는 상태를 말한다.
 * 실행 대기하는 스레드는 CPU 스케줄링에 따라 CPU를 점유하고 run() 메소드를 실행한다.
 * 이때 실행(Running) 상태라고 한다. 실행 스레드는 run() 메소드를 모두 실행하기 전에 스케줄링에 의해 다시 실행대기 상태로 돌아갈 수 있다.
 * 그리고 다른 스레드가 실행 상태가 된다.
 * 이렇게 스레드는 실행 대기 상태와 실행 상태를 번갈아 가면서 자신의 run() 메소드를 조금씩 실행한다.
 * 실행 상태에서 run() 메소드가 종료되면 더 이상 실행할 코드가 없기 때문에 스레드의 실행은 멈추게 된다.
 * 이 상태를 종료 상태(Terminated)라고 한다.
 */

import java.awt.*;

public class SleepEx {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
