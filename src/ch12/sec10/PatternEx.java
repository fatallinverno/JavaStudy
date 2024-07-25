package ch12.sec10;

/*
 * 장제목 : 12-10 정규 표현식 클래스
 * 작성일 : 2024.07.25
 *
 * 문자열이 정해져 있는 형식으로 구성되어 있는지 검증해야 하는 경우가 있따.
 * 예를 들어 이메일이나, 전화번호를 사용자가 제대로 입력했는지 검증할 때이다.
 * 자바는 정규 표현식을 이용해서 문자열이 올바르게 구성되어 있는지 검증한다.
 *
 * Pattern 클래스로 검증
 * java.util.regex 패키지의 Pattern 클래스는 정규 표현식으로 문자열을 검증하는 matches() 메소드를 제공한다.
 * 첫 번째는 매개값은 정규 표현식이고, 두 번쨰 매개값은 검증할 문자열이다.
 * 검증한 후의 결과ㅓ는 boolean 타입으로 리턴된다.
 */

import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";
        boolean result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치합니다");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }

        regExp = "\\w+@\\w+\\.\\w+(\\.\\w_)?";
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);
        if(result){
            System.out.println("정규식과 일치합니다");
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
