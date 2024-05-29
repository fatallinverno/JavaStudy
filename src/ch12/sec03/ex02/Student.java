package ch12.sec03.ex02;

/*
* 객체 해시코드
* 객체 해시코드란 객체를 식별하는 정수를 말한다.
* Object의 hasjCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 생성하기 떄문에 객체마다 다른 정수값을 리턴한다.
* hashCode() 메소드의 용도는 equals() 메소드와 비슷한데, 두 객체가 동등한지를 비교할 때 주로 사용한다.
* equals() 메소드와 마찬가지로 hashCode() 메소드 역시 객체의 데이터를 기준으로 재정의해서 새로운 정수값을 리턴하도록 하는 것이 일반적이다.
* 객체가 다르다 할지라도 내부 데이터가 동일하다면 같은 정수값을 리턴하지 위해서이다.
* */

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            if (no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}
