package ch14.sec08;

/*
 * 장제목 : 14-8 데몬 스레드
 * 작성일 : 2024.08.30
 *
 * 데몬 스레드는 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드이다.
 * 주 스레드가 종료되면 데몬 스레드도 따라서 자동으로 종료된다.
 * 데몬 스레드를 적요한 예로는 워드프로세서의 자동 저장, 미디어플레이어의 동영상 및 음악 재생, 가비지 컬렉터 등이 있는데,
 여기에서 주 스레드(워드프로세스, 미디어플레이어, JVM)가 종료되면 데몬 스레드도 같이 종료된다.
 * 스레드를 데몬으로 만들기 위해서는 주 스레드가 데몬이 될 스레드의 setDaemon(true)를 호출하면 된다.
 */

public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
