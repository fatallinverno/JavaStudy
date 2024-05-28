package ch11.sec06;

/*
* 예외 발생 시키기
* 자바에서 제공하는 표준 예외뿐만 아니라 사용자 정의 예외를 직접 코드에서 발생시키려면 throw 키워드와 함께 예외 객체를 제공하면 된다.
* 예와의 원인에 해당하는 메시지를 제공하고 싶다면 생성자 매개값으로 전달한다.
* */

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException {
        if(balance < money) {
            throw new InsufficientException("잔고 부족 : " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
