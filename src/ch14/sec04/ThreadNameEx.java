package ch14.sec04;

/*
 * 장제목 : 14-4 스레드 이름
 * 작성일 : 2024.08.29
 *
 * 스레드는 자신의 이름을 가지고 있다.
 * 메인 스레드는 'main'이라는 이름을 가지고 있고, 작업 스레드는 자동적으로 'Thread-n'이라는 이름을 가진다.
 * 작업 스레드의 이름을 Thread-n 대신 다른 이름으로 설정하고 싶다면 Thrread 클래스의 setName() 메소드를 사용하면 된다.
 * 스레드 이름은 디버깅 할 때 어떤 스레드가 작업을 하는지 조사할 목적으로 주로 사용된다.
 * 현재 코드를 어떤 스레드가 실행하고 있는지 확인하려면 정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은 다음 getName() 메소드로 이름을 출력해보면 된다.
 */

public class ThreadNameEx {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행");

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        chatThread.setName("chat-thread");
        chatThread.start();
    }
}
