package ch13.sec05;

/*
 * 장제목 : 13-5 와일드카드 타입 파라미터
 * 작성일 : 2024.08.28
 *
 * 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 타입 파라미터로 ?(와일드카드)를 사용할 수 있다.
 * ?는 범위에 있는 모든 타입으로 대체할 수 있다는 표시이다.
 */

public class GenericEx {
    public static void main(String[] args) {
        //모든 사람이 신청 가능
        Course.registerCourse1(new Applicant<Person>(new Person()));
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //학생만 신청 가능
//        Course.registerCourse2(new Applicant<Person>(new Person()));    (X)
//        Course.registerCourse2(new Applicant<Worker>(new Worker()));    (X)
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //직장인 및 일반인만 신청 가능
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));

    }
}
