package ch08.sec13;

/*
 * 장제목 : 8-13 봉인된 인터페이스
 * 작성일 : 2024.05.22
 *
 * Java 15부터는 무분별한 자식 인터페이스 생성을 방지하기 위해 봉인된(sealed) 인터페이스를 사용 할 수 있다.
 * sealed 키워드를 사용하면 permits 키워드 ㅇ뒤에 상속 가능한 자식 인터페이스를 지정해야 한다.
 */

public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}
