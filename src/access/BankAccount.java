package access;

public class BankAccount {
    private int balance;

    //Alt + insert = generate 단축키
    public BankAccount() {
        balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다");
        }
    }

    //public 메서드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드 : getBalance
    public int getBalance() {
        return balance;
    }

    //private 메서드 : isAmountValid
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}

/*
private 접근 제어자가 붙은 경우
1. balance : 데이터 필드는 외부에 직접 노출하지 않음 -> BankAccount가 제공하는 메서드를 통해서만 접근할 수 있게끔
2. isAmountValid() : 입력받은 금액을 검증하는 기능은 내부에서만 필요

public 접근 제어자가 붙은 경우
1. deposit() : 입금
2. withdraw() : 출금
3. getBalance() : 잔고 확인
-> 셋 모두 BankAccount를 사용하는 입장에서 필요한 기능

<캡슐화>
데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어 외부에서의 접근을 제한
-> 속성과 기능을 하나로 묶은 뒤, 외부에 필요한 '기능'만 노출하고 나머지는 모두 내부로 숨기는 것

객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 함!!

"데이터는 모두 숨기고 기능 중에서도 필요한 기능만 노출, 나머지는 다 숨기는 것이 좋은 캡슐화"
*/