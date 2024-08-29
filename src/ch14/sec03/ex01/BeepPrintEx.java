package ch14.sec03.ex01;

/*
 * 장제목 : 14-3 작업 스레드 생성과 실행
 * 작성일 : 2024.08.28
 *
 * 멀티 스레드로 실행하는 프로그램을 개발하려면 먼저 몇 개의 작업을 병렬로 실행할지 결정하고 각 작업별로 스레드를 생성해야 한다.
 * 자바 프로그램은 메인 스레드가 반드시 존재하기 때문에 메인 작업 이외에 추가적인 작업 수만큼 스레드를 생성하면 된다.
 * 자바는 작업 스레드도 객체로 관리하므로 클래스가 필요하다.
 * Thread 클래스로 직접 객체를 생성해도 되지만, 하위 클래스를 만들어 생성할 수 도 있다.
 */

import java.awt.*;

public class BeepPrintEx {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  //Toolkit 객체 얻기
        for(int i=0; i<5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
