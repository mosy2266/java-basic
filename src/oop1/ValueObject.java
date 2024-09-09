package oop1;

/*
자바 같은 객체 지향 언어는 클래스 내부에 속성(데이터)과 기능(메서드)을 함께 포함할 수 있음
= 클래스 내부에 멤버 변수(필드) 뿐만 아니라 메서드도 포함할 수 있다는 의미
*/

public class ValueObject {

    int value;

    //참고 : 이 클래스에서 만드는 add 메서드에는 static 키워드를 사용하지 않음
    void add() {
        value++;
        System.out.println("숫자 증가, value = " + value);
    }
}
