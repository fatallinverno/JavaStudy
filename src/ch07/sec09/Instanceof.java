package ch07.sec09;

/*
 * 장제목 : 7-9 객체 타입 확인
 * 작성일 : 2024.05.07
 *
 * 매개변수의 다형성에서 실제로 어떤 객체가 매개값으로 제공되었는지 확인한느 방법이 있다.
 * 꼭 매개변수가 아니더라도 변수가 참조하는 개체의 타입을 확인하고자 할 때, instanceof 연산자를 사용할 수 있다.
 * instanceof 연산자의 좌항에는 객체가 오고 우항에는 탕비이 오는데, 좌항의 객체가 우항의 타입이면 true로 산출하고 그렇지 않으면 false로 산출한다.
 * */

public class Instanceof {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name : " + person.name);
        person.walk();
    
        //매개값이 Student인 경우에만 강제 타입 변환해서 studentNo 필드와 study() 메소드 사용
        /*//person이 참조하는 객첵라 Student 타입인지 확인
        if(person instanceof Student){
            //Student 객체일 경우 경제 타입 변환
            Student student = (Student) person;
            //Student 객체만 가지고 있는 필드 및 메소드 사용
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }*/

        //Java 12 부터 사용 가능
        //person이 참조하는 객체가 Sdudent 타입일 경우
        //student 변수에 대입(타입 변환 발생)
        if(person instanceof Student student){
            System.out.println("studentNo : " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        //Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        //Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }

}
