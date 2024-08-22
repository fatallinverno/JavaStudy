package ch12.sec12;

/*
 * 장제목 : 12-12 어노테이션 - 어노테이션 설정 정보 이용
 * 작성일 : 2024.08.22
 *
 * 어노테이션은 아무런 동작을 가지지 않는 설정 정보일 뿐이다.
 * 이 설정 정보를 이용해서 어떻게 처리할 것인지는 애플리케이션의 몫이다.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
