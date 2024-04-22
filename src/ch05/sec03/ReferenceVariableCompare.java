package ch05.sec03;

/*
 * 장제목 : 5-3 참조 타입 변수의 ==, != 연산
 * 작석일 : 2024.04.22
 *
 * ==, != 연산자는 변수의 값이 같은지, 아닌지를 조사한다.
 * 참조 타입 변수의 값은 객체의 번지이므로 참조 타입 변수의 ==, != 연산자는 번지를 비교하는 것이 된다.
 * 번지가 같다면 동일한 객체를 참조하는 것이고, 다르다면 다른 객체를 참조하는 것이다.
 * */

public class ReferenceVariableCompare {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;
        
        arr1 = new int[] {1, 2, 3};         //배열 {1, 2, 3}을 생성하고 arr1 변수에 대입
        arr2 = new int[] {1, 2, 3};         //배열 {1, 2, 3}을 생성하고 arr2 변수에 대입
        arr3 = arr2;                         //배열 변수 arr2의 값을 배열 변수 arr3에 대입

        System.out.println(arr1 == arr2);    //arr1과 arr2 변수가 같은 배열을 참조하는지 검사

        System.out.println(arr2 == arr3);    //arr2과 arr3 변수가 같은 배열을 참조하는지 검사
    }
}
