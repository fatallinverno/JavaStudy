package ch03.sec03;

/*
 * 장제목 : 3-3 오버플로우 언더플로우
 * 작석일 : 2024.04.17
 *
 * 오버플로우란 타입이 허용되는 최대값을 벗어나는 것을 말한다.
 * 언더플로우는 타입이 허용하는 최소값을 벗어나는 것을 말한다.
 * */

public class OverflowUnderflow {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++){                     //{ }를 5번 반복 실행
            var1++;                                 //++ 연산은 var1의 값을 1 증가시킨다.
            System.out.println("var1 = " + var1);
        }

        byte var2 = -125;
        for(int i=0; i<5; i++){                     //{ }를 5번 반복 실행
            var2--;                                 //-- 연산은 var2의 값을 1 감소시킨다.
            System.out.println("var2 = " + var2);
        }
    }
}
