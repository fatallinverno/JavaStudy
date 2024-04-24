package ch05.sec12;

/*
 * 장제목 : 5-12 열거(Enum) 타입
 * 작석일 : 2024.04.24
 *
 * 데이이터 중에는 몇 가지로 한정된 값을 갖는 경우가 있다.
 * 요일은 월, 화, 수, 목, 금, 토, 일 이라는 7개의 값을, 계절은 봄, 여름, 가을, 겨울 이라는 4개의 값을 갖는다.
 * 이와 같이 한정된 값을 갖는 타입을 열거 타입이라고 한다.
 * */

public enum Week {              //Week 열거 타임 이름
    //열거 상수 목록
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
