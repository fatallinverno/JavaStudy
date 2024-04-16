package ch02.sec12;

/*
 * 장제목 : 2-11 변수 사용 범위
 * 작석일 : 2024.04.16
 *
 * main() 메소드 블록에는 다른 중괄호 {} 블록들이 작성될 수 있다.
 * 표준 출력 장치인 모니터(명령프롬프트, 터미널, 콘솔)에 값을 출력하기 위해 Stystem.out.println()을 이용했다.
 * 괄호() 안에 리터널을 넣으면 리터널이 그대로 출력되고, 변수를 넣으면 변수에 저장된 값이 출력된다.
 *
 * println(내용) = 괄호 안의 내용을 출력하고 행을 바꿔라.
 * print(내용) = 괄호 안의 내용을 출력하고 행은 바꾸지 말아라.
 * printf("형식문자열", 값1, 값2) = 형식 문자열에 맞추어 뒤의 값을 출력해라.
 * */

public class Printf {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%6d원\n", value);
        System.out.printf("상품의 가격:%-6d원\n", value);
        System.out.printf("상품의 가격:%06d원\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넒이:%10.2f\n", 10, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }
}
