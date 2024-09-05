package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a 변경
        a = 20;
        System.out.println("변경 a -> 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b 변경
        b = 30;
        System.out.println("변경 b -> 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

/*
자바의 대원칙 : 자바는 항상 변수의 값을 '복사'해서 대입
-> 기본형 변수인 a와 a를 복사한 기본형 변수 b의 경우 내용이 바뀌어도 서로 영향 X
*/