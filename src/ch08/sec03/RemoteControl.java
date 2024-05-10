package ch08.sec03;

/*
 * 장제목 : 8-3 상수 필드
 * 작성일 : 2024.05.10
 *
 * 인터페이스는 public static final 특성을 갖는 별분의 상수 필드를 멤버로 가질 수 있다.
 * 인터페이스에 선언된 필드는 모두 public static final 특성을 갖기 때문에 public static final을 생략하더라도 자동적으로 컴파일 과정에서 붙게 된다.
 * 상수명은 대문자로 작성하되, 서로 다른 단어로 구성되어 있을 경우에는 언더바(_)로 연결하는 것이 관례이다.
 * */

public interface RemoteControl {
    //상수 선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}
