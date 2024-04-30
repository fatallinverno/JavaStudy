package ch07.sec05.ex01;

/*
 * 장제목 : 7-5 final 클래스와 final 메소드
 * 작성일 : 2024.04.30
 *
 * 필드 선언 시에 final을 붙이면 초기값 설정 후 값을 변경할 수 없다. 그렇다면 클래스와 메소드에 final을 붙이면 어떤 효과가 일어날까?
 * final 클래스와 final 메소드는 상속과 관련이 있다.
 *
 * final 클래스
 * 클래스를 선언할 때 final 키워드를 class 앞에 붙이면 최종적인 클래스이므로 더 이상 상속할 수 없는 클래스가 된다.
 * 즉 final 클래스는 부모 클래스가 될 수 없어 자식 클래스를 만들 수 없다.
 * */

public final class Member {
}
