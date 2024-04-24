package ch05.sec10;

/*
 * 장제목 : 5-10 배열 항목 반복을 위한 향상된 for문
 * 작석일 : 2024.04.24
 *
 * */

public class AdvancedFor {
    public static void main(String[] args) {
        //배열 변수 선언과 배열 생성
        int[] scores = {95, 71, 84, 93, 87};
        //배열 항목 전체 합 구하기
        int sum = 0;
        for(int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합 : " + sum);
        //배열 항목 전체 평균 구하기
        double average = sum / scores.length;
        System.out.println("점수 평균 : " + average);
    }
}
