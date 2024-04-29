package ch07.sec02;

public class SmartPhoneEx {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로부터 상속받은 필드 읽기
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        //SmartPhone의 필드 읽기
        System.out.println("wifi 상태 : " + myPhone.wifi);

        //Phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
        myPhone.sendVoice("아~ 네 안녕하세요 반갑습니다.");
        myPhone.hangUp();

        //SmartPhone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
