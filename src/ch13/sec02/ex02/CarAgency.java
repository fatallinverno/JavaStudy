package ch13.sec02.ex02;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car();   //리턴 타입이 반ㄷ싀 Car여야 함.
    }
}
