package ch14.sec06.ex01;

/*
 * 장제목 : 14-6 스레드 동기화
 * 작성일 : 2024.08.29
 *
 * 멀티 스레드는 하나의 객체를 공유해서 작업할 수도 있다.
 * 이 경우 다른 스레드에 의해 객체 내부 데이터가 쉽게 변경될 수 있기 때문에 의도 했던 것과는 다른 결과를 나올 수 잇다.
 */

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + memory);
    }

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " + memory);
        }
    }
}
