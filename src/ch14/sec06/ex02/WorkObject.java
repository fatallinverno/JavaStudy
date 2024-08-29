package ch14.sec06.ex02;

/*
 * 장제목 : 14-6 스레드 동기화 - wiat()과 notify()를 이용한 스레드 제어
 * 작성일 : 2024.08.29
 *
 * 경우에 따라서는 두 개의 스레드를 교대로 번갈아 가며 실행할 때도 있다.
 * 정확3한 교대 작업이 필요할 경우, 자신의 작업이 끝나면 상대방 스레드를 일시 정지 상태에서 풀어주고 자신은 일시 정지 상태로 만들면 된다.
 * 이 방법의 핵심은 공유 객체에 있다.
 * 공유 객체는 두 스레드가 작업할 내용을 각각 동기화 메소드로 정해 놓는다.
 * 한 스레드가 작업을 완료하면 notify() 메소드를 호출해서 일시 정지 상태에 있는 다른 스레드를 실행 대기 상태로 만들고, 자신은 두 번 작업을 하지 않도록
 wait() 메소드를 호출하여 일시 정지 상태로 만든다.
 */

public class WorkObject {
    public synchronized void methodA() {            //동기화 메소드
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행");
        notify();       //다른 스레드를 실행 대기 상태로 만듦
        try {
            wait();     //자신의 스레드는 일시 정지 상태로 만듦
        } catch (InterruptedException e) {}
    }

    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify();       //다른 스레드를 실행 대기 상태로 만듦
        try {
            wait();     //자신의 스레드는 일시 정지 상태로 만듦
        } catch (InterruptedException e) {}
    }
}
