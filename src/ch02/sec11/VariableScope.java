package ch02.sec11;

/*
 * 장제목 : 2-11 변수 사용 범위
 * 작석일 : 2024.04.16
 *
 * main() 메소드 블록에는 다른 중괄호 {} 블록들이 작성될 수 있다.
 * 조건문에 해당하는 if, 반복문에 해당하는 for, while 등이 중괄호 {} 블록을 가질 수 있는데, 이러한 중괄호 {} 블록 내에서 선언된 변수는
 해당 중괄호 {} 블록내에서만 사용이 가능하고 밖에서는 사용할 수 없다.
 * */

public class VariableScope {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1 > 10){
            int v2 = v1 - 10;
        }
//        int v3 = v1 + v2 + 5;           //v2 변수를 사용 할 수 없기 때문에 컴파일 에러 발생.
    }
}
