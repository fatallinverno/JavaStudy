package ch06.sec11.ex02;

/*
* 상수 선언
* 우리 주변에는 불변의 값이 잌ㅆ다.
* 불변의 값은 수학에서 사용하는 원주율 파이나 지구의 무게 및 둘레 등이 해당된다.
* 이런 불변의 값을 저장하는 필드를 자바에서는 상수라고 부른다.
* 상수는 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안ㄷ 되기 때문에 static이면서 final인 특성을 가져야 한다.
* */

public class Earth {
    //상수 선언 및 초기화
    static final double EARTH_RADIUS = 6400;

    //상수 선언
    static final double EARTH_SURFACE_AREA;

    //정적 블록에서 상수 초기화
    static{
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
