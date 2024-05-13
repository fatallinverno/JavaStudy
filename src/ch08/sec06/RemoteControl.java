package ch08.sec06;

/*
 * 장제목 : 8-6 정적 메소드
 * 작성일 : 2024.05.13
 *
 * 인터페이스에는 정적 메소드도 선언이 가능하다.
 * 추상 메소드와 디폴트 메소드는 구현 객체가 필요하지만, 정적 메소드는 구현 객체가 없어도 인터페이스만으로 호출할 수 있다.
 * 선언 방법은 클래스 정적 메소드와 완전 동일하다.
 * 단 public을 생략하더라도 자동으로 컴파일 과정에서 붙는 것이 차이점이다.
 * */

public interface RemoteControl {
    //상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 합니다.");
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    //정적 메소드
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교환합니다.");
    }
}
