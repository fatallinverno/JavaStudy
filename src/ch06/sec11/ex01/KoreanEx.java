package ch06.sec11.ex01;

public class KoreanEx {
    public static void main(String[] args) {
        //객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "이자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //final 필드는 값을 변경할 수 없음
        //k1.nation = "USA";
        //k1.ssn = "123-12-1234";

        //비 final 필드는 값 변경 가능
        k1.name = "이이이";
        System.out.println(k1.name);
    }
}
