package oop1;

public class ValueObjectMain {
    public static void main(String[] args) {

        //valueObject라는 객체를 생성 -> 이 객체는 멤버 변수 뿐만 아니라 기능을 수행하는 add() 메서드도 내부에 함께 존재
        ValueObject valueObject = new ValueObject();

        /*
        인스턴스의 메서드 호출은 멤버 변수를 사용하는 방법과 동일 .(dot)을 사용

        add() 메서드를 호출
        -> 메서드 내부에서 value++를 호출
        -> 이때 value에 접근해야 하는데, 기본적으로 본인 인스턴스에 있는 멤버 변수에 접근
        */
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);
    }
}

/*
정리
1. 클래스는 속성(데이터, 즉 멤버 변수)과 기능(메서드)을 정의할 수 있음
2. 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있음
    2-1. 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수임
*/