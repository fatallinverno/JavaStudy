package ch12.sec05;

/*
 * StringBuilder 클래스
 * String은 내부 문자열을 수정할 수 없다.
 * 다른 문자열을 결합해서 내부 문자열을 변경하는 것처럼 보이지만 사실 'ABCDEF'라는 새로운 String 객체를 생성하는 것이다.
 * 문자열의 + 연산은 새로운 String 객체가 생성되고 이전 객체는 계속 버려지는 것이기 때문에 효율성이 좋다고는 볼 수 없다.
 * 잦은 문자열 변경 작업을 해야 한다면 String보다는 StringBuilder를 사용하는 것이 좋다.
 * StringBuilder는 내부 버퍼(데이터를 저장하는 메모리)에 문자열을 저장해두고 그 안에서 추가, 수정, 삭제 작업을 하도록 설계되어 있다.
 */

public class StringBuilderEx {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString();
        System.out.println("data: " + data);
    }
}
