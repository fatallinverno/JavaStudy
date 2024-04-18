package ch04.sec02;

/*
 * 장제목 : 4-2 if 문
 * 작석일 : 2024.04.18
 *
 * */

public class IfEx {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
