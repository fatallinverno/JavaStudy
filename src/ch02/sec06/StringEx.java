package ch02.sec06;

/*
 * 장제목 : 2-6 문자열 타입
 * 작석일 : 2024.04.15
 *
 * 큰따옴표(")로 감싼 문자들을 문자열이라고 부르는데, 문자열을 변수에 저장하고 싶다면 String 타입을 사용해야 한다.
 * */

public class StringEx {

    public static void main(String[] args) {

        String  name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.println("나는\n");
        System.out.println("자바를\n");
        System.out.println("배웁니다.");

    }

}
