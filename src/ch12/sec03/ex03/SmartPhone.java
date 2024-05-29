package ch12.sec03.ex03;

/*
* 객체 문자 정보
* Object의 toString() 메소드는 객체의 문자 정보를 리터한다.
* 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다.
* 기본적으로 Object의 toString() 메소드는 '클래스명@16진수해시코드'로 구성된 문자열을 리턴한다.
* 객체의 문자 정보가 중요한 경우에는 Object의 toString() 메소드를 재정의해서 간결하고 유익한 정보를 리턴하도록 해야한다.
* */

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        //Object의 toString() 메소드를 재정해서 제조사와 운영체제가 결합된 문자열을 리턴하도록 함.
        return company + ", " + os;
    }
}
