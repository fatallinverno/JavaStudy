package ch12.sec03.ex01;

/*
 * 장제목 : 12-3 Object 클래스
 * 작성일 : 2024.05.29
 *
 * 클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로 java.lang.Object 클래스를 상송하게 된다.
 * 따라서 자바의 모든 클래스는 Object의 자식이거나 자손 클래스이다.
 *
 * 객체 동등 비교
 * Object의 equals() 메소드는 객체의 번지를 비교하고 boolean 값을 리턴한다.
 * equals() 메소드의 매개변수 타입이 Object이므로 자동 타입 변환에 의해 모든 객체가 매개값으로 대입될 수 있다.
 * equals() 메소드는 비교 연산자인 ==과 동일한 결과를 리턴한다.
 */

public class Member {
    public String id;

    public Member (String id) {
        this.id = id;
    }

    @Override
     public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            if(id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
}
