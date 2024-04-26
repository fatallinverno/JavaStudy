package ch06.sec14;

/*
 * 장제목 : 6-14 Getter Setter
 * 작성일 : 2024.04.26
 *
 * 객체의 필드(데이터)를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성(결점이 없는 성질)이 깨질 수 있다.
 * 예를 들어 자동차의 속력은 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
 * 이러한 문제점 때문에 객체지향 프로그래밍에서는 직접적인 외부에서의 필드 접근을 막고, 그 대신 메소드를 통해 ㅊ필드에 근하는 것을 선호한다.
 * */

public class Car {
    //필드 선언
    private int speed;
    private boolean stop;

    //speed 필드의 Getter/Setter 선언
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed < 0){
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    //stop 필드의 Getter/Setter 선언
    public boolean isStop(){
        return stop;
    }
    public void setStop(boolean stop){
        this.stop = stop;
        if(stop == true){
            this.speed = 0;
        }
    }
}
