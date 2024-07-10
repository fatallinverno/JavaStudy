package ch12.sec05;

/*
 * 장제목 : 12-5 문자열 클래스
 * 작성일 : 2024.07.10
 *
 * 문자열 클래스
 * String : 문자열을 저장하고 저작할 떄 사용
 * StringBuilder : 효율적인 무자열 조작 기능이 피룡할 때 사용
 * StringTokenizer 구분자로 연결된 문자열을 분리할 때 사용
 *
 * String 클래스는 문자열을 저장하고 저작할 때 사용한다.
 * 문자열 리터럴을 자동으로 String 객체로 생성되지만, String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있다.
 */

import java.util.Arrays;

public class BytesToStringEx {
    public static void main(String[] args) throws Exception {
        String data = "자바";

        //String -> byte 배열(기본 : UTF-8 인코딩)
        byte[] arr1 = data.getBytes(); //byte[] arr1 = data.getBytes("UTF-8);
        System.out.println("arr1 : " + Arrays.toString(arr1));

        //byte 배열 -> String(기본 : UTF-8 인코딩)
        String str1 = new String(arr1); //String str1 = new String(arr1, "UTF-8);
        System.out.println("str1 : " + str1);

        //String -> byte 배열(EUC-KR 인코딩)
        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println("arr2 : " + Arrays.toString(arr2));

        //byte 배열 -> String(EUC-KR 인코딩)
        String str2 = new String(arr2, "EUC-KR");
        System.out.println("str2 : " + str2);
    }
}
