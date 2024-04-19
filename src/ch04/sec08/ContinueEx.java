package ch04.sec08;

/*
 * 장제목 : 4-8 continue 문
 * 작석일 : 2024.04.19
 *
 * continue 문은 반복문인 for 문, while 문, do-while 문에서만 사용되는데, 블록 내부에서 continue 문이 실행되면
 for 문의 증감식 또는 while 문, do-while 문의 조건식으로 바로 이동한다.
 * continue 문은 반복문을 종료하지 않고 계속 수행한다는 점이 break 문과 다르다.
 * break 문과 마찬가지고 continue 문도 대개 if 문과 같이 사용되는데, 특정 조건을 만족하는 경우에 continue 문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
 * */

public class ContinueEx {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {                  //2로 나눈 나머지가 0이 아닐경우, 즉 홀수인 경우
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i + " ");            //홀수는 실행되지 않는데.
        }
    }
}
