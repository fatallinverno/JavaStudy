package ch08.sec04;

/*
* 구현 클래스에서 추상 메소드를 재정의할 때 주의할 점은 인터페이스의 추상 메소드는 기본적으로 public 접근 제한을 갖기 때문에 public 보다 더 낮은 접근 제한으로 재정의할 수 없다.
* 그래서 재정의되는 메소드에는 모두 public이 추가되어 있다.
* 인터페이스로 구현 객체를 사용하려면 인터페이스 변수를 선언하고 구현 객체를 개입해야 한다.
* 인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입되면 구현 객체의 번지를 저장한다.
* 구현 객체가 대입되면 인터페이스 변수로 추상 메소들르 호출 할 수 있게 된다.
* 이 때 어떤 구현 객체가 대입되었는지에 따라 실행 내용이 달라진다.
* */

public class RemoteControlEx {
    public static void main(String[] args) {
        //인터페이스 변수 선언
        RemoteControl rc;

        //Television 객체를 생성하고 인터페이스 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        //Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
