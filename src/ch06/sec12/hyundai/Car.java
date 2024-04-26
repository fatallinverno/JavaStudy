package ch06.sec12.hyundai;

/*
 * 장제목 : 6-12 패키지
 * 작성일 : 2024.04.26
 *
 * 자바의 패키지는 단순히 디렉토리만을 의미하지는 않는다.
 * 패ㅈ키지는 클래스의 일부분이며, 클래스를 식별하는 용도로 사용된다.
 * 패키지는 주로 개발 회사 도메인 이름의 역순으로 만든다.
 * mycompany.com 회사의 패키지는 com.mycompany로, yourcompany.com 회사의 패키지는 com.yourcompany로 만든다.
 *
 * 패키지 선언
 * 패키지 디렉토리는 크래스를 컴파일 하는 과정에서 자동으로 생성된다.
 * 컴파일러는 클래스의 패키지 선언을 보고 디렉토리를 자동 생성시킨다
 * 패키지 선언은 package 키워드와 함께 패키지 이름을 기술한 것으로, 항상 소스 파일 최상단에 위치해야 한다.
 *
 * import 문
 * 같은 패키지에 있는 클래스는 아무런 조건 없이 사용할 수 있지만, 다른 패키지에 있는 클래스를 사용하려면
 import문ㅇ을 이용해서 어떤 패키지의 클래스를 사용하는지 명시해야 한다.
 * */

//import 문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
    //부품 필드 선언
    ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
    ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();
    
}
