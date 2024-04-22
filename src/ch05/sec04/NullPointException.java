package ch05.sec04;

/*
 * 장제목 : 5-4 Null과 NullPointException
 * 작석일 : 2024.04.22
 *
 * 참조 타입 변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null 값을 가질 수 있다.
 * null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.
 * */

public class NullPointException {
    public static void main(String[] args) {
        int [] intArray = null;
//        intArray[0] = 10;               //NullPointException

        String str = null;
//        System.out.println("총 문자 수 : " + str.length());
    }
}
