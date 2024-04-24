package ch06.sec04;

/*
 * 장제목 : 6-4 객체 생성과 클래스 변수
 * 작석일 : 2024.04.24
 *
 * 클래스로부터 객체를 생성하려면 객체 생성 연산자인 new가 필요하다.
 * new 연산자 뒤에는 생성자 호출 코드가 오는데, 클래스() 형태를 가진다.
 * */

public class StudentEx {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    }
}
