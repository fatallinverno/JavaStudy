package ch05.sec05;

public class EmptyString {
    public static void main(String[] args) {
        String hobby = "";
        if(hobby.equals("")){
            System.out.println("hobby 변수가 참조한느 String 객체는 빈 문자열");
        }
    }
}
