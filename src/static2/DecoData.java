package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; 인스턴스 변수 접근 -> compile error
        //instanceMethod(); 인스턴스 메서드 접근 -> compile error

        staticValue++;
        staticMethod();

        /*
        이 메서드는 정적 메서드 -> static만 사용할 수 있음 = 정적 변수, 정적 메서드에는 접근이 가능
        static이 없는 인스턴스 변수, 인스턴스 메서드에는 접근 불가(컴파일 오류)
        */
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();

        /*
        이 메서드는 인스턴스 메서드 -> 모든 곳에서 공용인 static 호출 가능 = 정적 변수, 정적 메서드에 접근 가능
        당연히 인스턴스 변수, 인스턴스 메서드에도 접근 가능
        */
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
