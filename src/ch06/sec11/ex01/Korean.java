package ch06.sec11.ex01;

/*
 * 장제목 : 6-11 final 필드와 상수
 * 작성일 : 2024.04.25
 *
 * 인스턴스 필드와 정적 필드는 언제든지 값을 변경할 수 있다.
 * 그러나 경우에 따라서는 값을 변경하는 것을 막고 읽기만 허용해야 할 때가 있다.
 * 이때 final 필드와 상수를 선언해서 사용한다.
 * final 필드 선언
 * final은 '최종적'이란 뜻을 가지고 있다.
 * final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없게된다.
 * */

public class Korean {
    //인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    //인스턴스 필드 선언
    String name;

    //생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
