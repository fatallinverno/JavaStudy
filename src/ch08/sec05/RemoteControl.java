package ch08.sec05;

/*
 * 장제목 : 8-5 디폴트 메소드
 * 작성일 : 2024.05.13
 *
 * 인터페이스에는 완전한 실행 코드를 가진 디폴트 메소드를 선언할 수 있다.
 * 추상 메소드는 실행부(중괄호 {})가 없지만, 디폴트 메소드는 실행부가 있다.
 * 선언 방법은 클래스 메소드와 동일한데, 차이점은 default 키워드가 리턴 타입 앞에 붙는다.
 * */

public interface RemoteControl {
    //상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 인스턴스 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 합니다.");
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
}
