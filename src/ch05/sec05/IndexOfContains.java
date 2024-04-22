package ch05.sec05;

/*
 * 장제목 : 5-5 문자열(String) 타입
 * 작석일 : 2024.04.22
 *
 * 문자열 찾기
 * 문자열에서 특정 문자열의 위치를 찾고자 할 떄에는 indexOf() 메소드를 사용한다.
 * indexOf() 메소드는 주어진 문자열이 시작되는 인덱스를 리턴한다.
 * */

public class IndexOfContains {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        String substring = subject.substring(location);
        System.out.println(substring);

        location = subject.indexOf("자바");
        if(location != -1){
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
