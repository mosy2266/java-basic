package access.a;

//public 접근 제어자 -> 파일명과 클래스명이 동일, 외부에서 접근 가능
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

//default 접근 제어자 -> 같은 패키지 내에서만 접근 가능
class DefaultClass1 {
}

//default 접근 제어자 -> 같은 패키지 내에서만 접근 가능
class DefaultClass2 {
}

/*
클래스 레벨의 접근 제어자는 public, default만 사용할 수 있음 -> private, protected는 사용 불가
public 클래스는 반드시 파일명과 이름이 같아야 함!!!
하나의 자바 파일에 public 클래스는 하나만 등장할 수 있음
하나의 자바 파일에 default 클래스는 개수 상관 X
*/