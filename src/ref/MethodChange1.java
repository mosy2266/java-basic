package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitive(a); //메서드를 호출할 때 사용하는 매개변수(파라미터)도 변수일 뿐 -> 자바의 대원칙을 준수함!!
        /*
        x에 a의 값이 복사되어 10이 대입되었다가, 메서드가 동작해 20으로 바뀜
        이때 x의 값만 20으로 바뀔 뿐 a의 값은 10으로 유지!

        참고로 메서드가 종료되면 매개변수 x는 제거됨
        */
        System.out.println("메서드 호출 후 a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
