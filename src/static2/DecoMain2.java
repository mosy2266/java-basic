package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}

/*
static이 붙은 정적 메서드는 객체 생성 없이 (클래스 명).(메서드 명)으로 바로 호출할 수 있음

클래스명 앞에 static이 붙은 메서드를 정적 메서드 또는 클래스 메서드라고 함
-> 인스턴스 생성 없이 클래스에 있는 메서드를 호출하듯이 사용

static이 붙지 않은 메서드를 인스턴스 메서드라고 함
-> 인스턴스를 생성해야만 호출할 수 있음

<정적 메서드 사용법>
1. static 메서드는 static만 사용할 수 있음
    1-1. 클래스 내부의 기능을 사용할 때, 정적 메서드는 static이 붙은 다른 정적 메서드나 정적 변수만 사용 가능
    1-2. 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 메서드나 인스턴스 변수를 사용 불가
2. 모든 곳에서 static을 호출할 수 있음
    2-1. 정적 메서드 = 공용 기능 -> 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static을 호출할 수 있음
*/