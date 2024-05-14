package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }

    //turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }

    //search() 추상 메소드 오버라이딩
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
