package ch07.sec03.ex01;

import ch07.sec02.SmartPhone;

public class SmartPhoneEx {
    public static void main(String[] args) {
        //SmartPhone 객체 생새어
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
