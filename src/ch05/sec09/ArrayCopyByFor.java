package ch05.sec09;

/*
 * 장제목 : 5-9 배열 복사
 * 작석일 : 2024.04.24
 *
 * 배열은 한 번 생성하면 길이를 변경할 수 없다.
 * 더 많은 저장 공간이 필요하다면 더 큰 길이의 배열을 새로 만들고 이전 배열로부터 항목들을 복사해야 한다.
 * */

public class ArrayCopyByFor {
    public static void main(String[] args) {
        //길이 3인 배열
        int[] oldIntArray = {1, 2, 3};
        //길이 5인 배열을 새로 생성
        int[] newIntArray = new int[5];
        //배열 항목 복사
        for(int i = 0; i < oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }
        //배열 항목 출력
        for(int i = 0; i < newIntArray.length; i++){
            System.out.println(newIntArray[i] + ", ");
        }
    }
}
