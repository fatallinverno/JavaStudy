package ch07.sec02;

/*
 * 장제목 : 7-2 클래스 상속
 * 작성일 : 2024.04.29
 *
 * 현실에서의 상속은 부모가 자식을 선택해서 물려주지만, 프로그램에서는 자식이 부모를 선택한다.
 * 자식 클래스를 선언할 때 어떤 부모로부터 상속받을 것인지를 결정하고, 부모 클래스를 extends 뒤에 기술한다.
 * */

public class phone {
    //필드 선언
    public String model;
    public String color;
    
    //메소드 선언
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    
    public void sendVoice(String message){
        System.out.println("자기 : " + message);
    }

    public void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }

    public void hangUp(){
        System.out.println("전화를 끓습니다.");
    }
}
