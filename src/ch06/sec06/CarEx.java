package ch06.sec06;

/*
 * 장제목 : 6-6 필드 선언과 사용
 * 작석일 : 2024.04.24
 *
 * 필드는 객체의 데이터를 저장하는 역할을 한다.
 * 객체의 데이터에는 고유 데이터, 현재 상태 데이터, 부품 데이터가 있다.
 * 자동차 객체를 예로 들면 제작회사, 모델, 색깔, 최고 속도는 고유 데이터에 해당하고, 현재 속도, 엔진 회전 수는 상태 데이터에 해당한다.
 * 차체, 엔진, 타이어는 부품에 해당한다.
 * */

public class CarEx {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        //Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도 : " + myCar.speed);
    }

}
