package ch12.sec08;

/*
 * 장제목 : 12-8 날짜와 시간 클래스
 * 작성일 : 2024.07.11
 *
 * 자바는 컴퓨터의 날짜 및 시각을 읽을 수 있도록 java.util 패키지에서 Date와 Calendar 클래스를 제공하고 있다.
 * 또한 날짜와 시간을 조작할 수 있도록 java.time 패키지에서 LocalDateTime 등의 클래스를 제공한다.
 *
 * Date 클래스
 * Date는 날짜를 표현하는 클래스로 객체 간에 날짜 정보를 주고받을 때 사용된다.
 * Date 클래세으는 여러개의 생정자가 선언되어 있지만 대부분 Deprecated(더 이상 사용되지 않음) 되어  Date() 생성자만 주로 사용된다.
 * Date() 생성자는 컴퓨터ㅢ 현재 날짜를 읽어 Date 객체로 만든다.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}
