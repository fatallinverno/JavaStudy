package ch02.sec01;

/*
 * 장제목 : 2-1 변수 선언
 * 작성일 : 2024.04.15
 * */

public class VariableUse {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간" + minute + "분");

        int totalMinute = (hour * 60) + minute;
        System.out.println("총" + totalMinute + "분");

    }
}
