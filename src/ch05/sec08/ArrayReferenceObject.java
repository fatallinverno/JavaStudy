package ch05.sec08;

/*
 * 장제목 : 5-8 객체를 참조하는 배열
 * 작석일 : 2024.04.24
 *
 * 기본타입 (byte, char, short, int, long, float, double, boolean) 배열은 각 항목에 값을 직접 저장하지만,
 참조 타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 저장한다.
 * */


public class ArrayReferenceObject {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
    }
}
