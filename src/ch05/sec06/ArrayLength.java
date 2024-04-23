package ch05.sec06;

/*
 * 장제목 : 5-6 배열(Array) 타입
 * 작석일 : 2024.04.23
 *
 * 배열 길이
 * 배열의 길이란 배열에 저장할 수 있는 항목 수를 말한다.
 * 코드에서 배열의 길이를 얻으려면 도트(.) 연산자를 사용해서 참조하는 배열의 length 필드를 읽으면 된다.
 * */

public class ArrayLength {
    public static void main(String[] args) {
        //배열 변수 선언과 배열 대입
        int[] scores = {84, 90, 96};

        //배열 항목의 총합 구하기
        int sum = 0;
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        //배열 항목의 평균 구하기
        double average = (double) sum / scores.length;
        System.out.println("평균 : " + average);
    }
}
