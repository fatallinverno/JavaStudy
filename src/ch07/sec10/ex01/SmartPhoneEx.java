package ch07.sec10.ex01;

public class SmartPhoneEx {
    public static void main(String[] args) {
        //Phone phone = new Phone(); //사용 불가

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
