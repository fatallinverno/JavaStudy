package ch12.sec09;

/*
 * 장제목 : 12-9 형식 클래스
 * 작성일 : 2024.07.25
 *
 * Format(형식) 클래스는 숫자 또는 날짜를 원하는 형태의 문자열로 변환해주는 기능을 제공한다.
 * Format 클래스는 java.text 패키지에 포함되어 있는데, 주요 Format 클래스는 다음과 같ㄷㅏ.
 *
 * DicimalFormat
 * DecimalFormat은 숫자를 형식화된 문자열로 변환하는 기능을 제공하낟.
 * 패턴 정보와 함께 DecimalFormat 객체를 생성하고 format() 메소드로 숫자를 제공하면 패턴에 따른 형식화된 문자열을 얻을 수 있다.
 */

import java.text.DecimalFormat;

public class DecimalFormatEx {
    public static void main(String[] args) {
        double num = 1234567.89;

        DecimalFormat df;

        //정수 자리까지 표기
        df = new DecimalFormat("#,###");
        System.out.println(df.format(num));

        //무조건 소수 첫째 자리까지 표기
        df = new DecimalFormat("#,###.0");
        System.out.println(df.format(num));
    }
}
