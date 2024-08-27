package ch13.sec03;

/*
 * 장제목 : 13-3 제네릭 메소드
 * 작성일 : 2024.08.27
 *
 * 제네릭 메소드는 타입 파라미터를 가지고 있는 메소드를 말한다.
 * 타입 파라미터가 메소드 선언부에 정의된다는 ㅈ점에서 제네릭 타입과 차이가 있다.
 * 제네릭 메소드는 리턴 앞에 <> 기호를 추가하고 타입 파라미터를 정의한 뒤, 리턴 타입과 매개변수 타입에서 사용한다.
 */

public class GenericEx {
    //제네릭 메소드
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        //제네릭 메소드 호출
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        //제네릭 메소드 호출
        Box<String> box2 = boxing("홍길동");
        String stringValue = box2.get();
        System.out.println(stringValue);
    }
}
