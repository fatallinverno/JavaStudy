package ch08.sec02;

/*
 * 장제목 : 8-2 인터페이스와 구현 클래스 선언
 * 작성일 : 2024.05.10
 *
 * 인터페이스는 '*.java' 형태의 소스 파일로 작성되고 '*.class' 형태로 컴파일되기 떄문에 물리적 형태는 클래스와 동일하다.
 * 단 소스를 작성할 때 선언하는 방법과 구성 멤버가 클래스와 다르다.
 *
 * 인터페이스 선언
 * 인터페이스 선언은 class 키워드 대신 interface 키워드를 사용한다.
 * 접근 제한자로는 클래스와 마찬가지로 같은 패키지 내에서만 사용 가능한 default, 패키지와 상관없이 사용하는 public을 붙일 수 있다.
 * */

public interface RemoteControl {
    //public 추상 메소드
    public void turnOn();
}
