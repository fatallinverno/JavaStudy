package ch05.sec05;

/*
 * 장제목 : 5-5 문자열(String) 타입
 * 작석일 : 2024.04.22
 *
 * 문자열 분리
 * 문자열이 구분자를 사용하여 여러 개의 문자열로 구성되어 있을 경우, 이를 따로 분리해서 얻고 싶다면 split() 메소드를 사용한다.
 * */

public class Split {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        //문자열 분리
        String[] tokens = board.split(",");

        //인델스별로 읽기
        System.out.println("번호 : " + tokens[0]);
        System.out.println("제목 : " + tokens[1]);
        System.out.println("내용 : " + tokens[2]);
        System.out.println("성명 : " + tokens[3]);
        System.out.println();

        //for 문을 이용한 읽기
        for(int i=0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }
    }
}
