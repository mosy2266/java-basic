package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1(초기값을 설정하지 않은 멤버 변수) = " + data.value1);
        System.out.println("value2(10으로 초기화한 멤버 변수) = " + data.value2);
    }
}

/*
<실행 결과>
value1(초기값을 설정하지 않은 멤버 변수) = 0
value2(10으로 초기화한 멤버 변수) = 10

초기값을 설정해두지 않은 value1의 경우 0으로 자동 초기화된 것을 볼 수 있음!
*/