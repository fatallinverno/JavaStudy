package ch05.sec06;

/*
 * 장제목 : 5-6 배열(Array) 타입
 * 작석일 : 2024.04.23
 *
 * new 연산자로 배열 생성
 * 값의 목록은 없지만 향후 값들을 저장할 목적으로 배열을  미리 생성할 수도 있다.
 * */

public class ArrayCreateByNew {
    public static void main(String[] args) {
        //배열 변수 선언과 밴열 생성
        int[] arr1 = new int[3];
        //배열 항목의 초기값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
        System.out.println();

        //배열 항목의 값 변경
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        //배열 항목의 변경 값 출력
        double[] arr2 = new double[3];
        //배열 항목의 초기값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        System.out.println();

        //배열 항목의 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        //배열 항목의 변경 값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
        System.out.println();

        //배열 변수 선언과 배열 생성
        String[] arr3 = new String[3];
        //배열 항목의 초기값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
        System.out.println();

        //배열 항목의 값 변경
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        //배열 항목의 변경값 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
    }
}
