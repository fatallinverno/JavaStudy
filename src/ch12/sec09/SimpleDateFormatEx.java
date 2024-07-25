package ch12.sec09;

/*
* SimpleDateFormat
* SimpleDateFormat은 날짜를 형식화된 문자열로 변환하는 기능을 제공한다.
* 패턴에는 자릿수에 맞게 기호를 반복해서 작성할 수 있다.
* 예를 들어 yyyy는 년도를 4자리로, MM과 dd는 각각 월과 일의 2자리로 표시하라는 의미이다.
* 패턴 정보와 함꼐 SimpleDateFormat 객체를 생성하고 format() 메소드로 날짜를 제공하면 패턴과 동일한 문자열을 얻을 수 있다.
* */

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("올해의 D번째 날");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("이달의 d번째 날");
        System.out.println(sdf.format(now));
    }
}
