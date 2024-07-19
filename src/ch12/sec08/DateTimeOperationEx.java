package ch12.sec08;

/*
* 날짜와 시간 조작
* Date와 Calendar는 날짜와 시간 정보를 얻기에는 충분하지만, 날짜와 시간을 조작할 수는 없다.
* 이때는 java.time 패키지의 LocalDateTime 클래스가 제공하는 다음 메소드를 이용하면 매우 쉽게 날짜와 시간을 조작할 수 있다.
* */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간 : " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈 : " + result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2월 뺄셈 : " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈 : " + result3.format(dtf));
    }
}
