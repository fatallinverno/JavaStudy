package ch14.sec07.ex01;

public class SafeStopEx {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        printThread.setStop(true);
    }
}
