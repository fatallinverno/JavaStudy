package ch05.sec05;

/*
 * 장제목 : 5-5 문자열(String) 타입
 * 작석일 : 2024.04.22
 *
 * 문자 추출
 * 문자열에서 특정 위치의 문자를 얻고 싶다면 charAt() apthemfmf dldydgkf tn dlTek.
 * charAt() 메소드는 매개값으로 주어진 인덱스의 문자를 리턴한다.
 * */

public class CharAt {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char gender = ssn.charAt(6);
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자 입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자 입니다.");
                break;
        }
    }
}
