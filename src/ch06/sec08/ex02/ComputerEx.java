package ch06.sec08.ex02;

/*
 * 가변길이 매개변수
 * 메소드를 호출할 때에는 매개변수의 ㄱ대수에 맞게 매개값을 제공해야 한다.
 * 만약 메소드가 가변길이 매개변수를 가지고 있다면 매개변수의 개수와 상관없이 매개값을 줄 수 있다.
 * */

public class ComputerEx {
    public static void main(String[] args) {
        //Computer 객체 생성
        Computer myCom = new Computer();

        //sum() 메소드 호출 시 매개값 1,2,3을 제공하고 합선 결과를 리턴받아 result1 변수에 대입
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1 = " + result1);

        //sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고 합산 결과를 리턴받아 result2 변수에 대입
        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2 = " + result2);

        //sum() 메소드 호출 시 배열을 제공하고 합산 결과를 리턴받아 result3 변수에 대입
        int[] values = {1, 2, 3, 4, 5};
        int result3 = myCom.sum(values);
        System.out.println("result3 = " + result3);

        //sum() 메소드 호출 시 배열을 제공하고 합산 결과를 리턴받아 result4 변수에 댕비
        int result4 = myCom.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4 = " + result4);

    }
}
