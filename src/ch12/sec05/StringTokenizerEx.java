package ch12.sec05;

/*
* StringTokenizer 클래스
* 문자열이 구분자로 연결되어 있을 경우, 구분자를 기준으로 문자열을 분리하려면 String의 split() 메소드를 이용하거나 java.util 패키지의 StringTokenizer 클래스를 이용할 수 있다.
* split은 정규 표현식으로 구분하고, StringTokenizer는 문자로 구분한다는 차이점이 있다.
* */

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");

        for(String token : arr) {
            System.out.println(token);
        }

        System.out.println();

        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
