package ch07.sec08.ex02;

public class DriverEx {
    public static void main(String[] args) {
        //Driver 객체 생성
        Driver driver = new Driver();

        //매게값으로 Bus 객체를 제공하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus);

        //매게값으로 Taxi 객체를 제공하고 driver() 메소드 호출
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
