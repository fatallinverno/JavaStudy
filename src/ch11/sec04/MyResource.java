package ch11.sec04;

/*
 * 장제목 : 11-4 리소스 자동 닫기
 * 작성일 : 2024.05.28
 *
 * 리소스란 데이터를 제공하는 객체를 말한다.
 * 리소스는 사용하기 위해 열어야(open)하며, 사용이 끝난 다음에는 닫아야(close) 한다.
 * 예를들어 파일 내용을 읽기 위해서는 파일을 열어야 하며, 다 읽고 난 후에는 파일을 닫아야 다른 프로그램에서 사용할 수 있다.
 * 리소스를 사용하다가 예외가 발생될 경우에도 안전하게 닫는 것이 중요하다. 그렇지 않으면 리소스가 불안정한 상태로 남아있게 된다.
 */

public class MyResource implements AutoCloseable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource (" + name + ") 열기]");
    }

    public String read1() {
        System.out.println("[MyResource (" + name + ") 읽기]");
        return "100";
    }

    public String read2() {
        System.out.println("[MyResource (" + name + ") 읽기]");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[MyResource (" + name + ") 닫기]");
    }
}
