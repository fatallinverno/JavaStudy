package ch12.sec03.ex04;

/*
 * 레코드 선언
 * 데이터 전달을 위한 DTO(Data Transfer Object)를 작성할 때 반복적으로 사용되는 코드를 줄이기 위해 Java 14부터 레코드가 도입되었다.
 * */

public record Member(String id, String name, int age) {
}
