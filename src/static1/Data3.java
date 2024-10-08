package static1;

public class Data3 {
    public String name;
    public static int count; //static으로 선언

    public Data3(String name) {
        this.name = name;
        count++;
    }
}

/*
기존 코드를 유지하기 위해 새로운 클래스 Data3를 만듦
1. static int count -> 변수 타입(int) 앞에 static 키워드가 붙어 있음
    1-1. 이런 식으로 멤버 변수에 static을 붙이게 되면 해당 변수는 static 변수, 정적 변수, 또는 클래스 변수라고 함
2. 객체가 생성되면 생성자에서 정적 변수 count의 값을 1 증가시킴

<멤버 변수(필드)의 종류>
1. 인스턴스 변수 : static이 붙지 않은 멤버 변수. 위 코드의 경우 name
    1-1. static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고 인스턴스에 소속되어 있음
    1-2. 인스턴스 변수는 인스턴스를 만들 때마다 새로 만들어짐
2. 클래스 변수 : static이 붙은 멤버 변수. 위 코드의 경우 count
    2-1. 클래스 변수, 정적 변수, static 변수 등으로 부름(모든 용어를 사용하므로 기억해둘 것)
    2-2. static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용 가능, 클래스에 소속되어 있음
    2-3. 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어짐 -> 인스턴스와 다르게 보통 여러 곳에서 공유하는 목적으로 사용됨

<변수의 생명 주기>
1. 지역 변수(매개변수 포함) : 지역 변수는 스택 영역 안에 있는 스택 프레임에 보관됨
-> 메서드가 종료되면 스택 프레임도 제거, 이때 해당 스택 프레임에 포함된 지역 변수도 함께 제거됨
-> 생명 주기가 짧은 편

2. 인스턴스 변수 : 인스턴스 변수는 힙 영역을 사용
-> 힙 영역은 GC(가비지 컬렉션)가 발생하기 전까지 생존
-> 지역 변수보다는 긴 편

3. 클래스 변수 : 클래스 변수는 메서드 영역의 static 영역에 보관됨
-> 메서드 영역은 프로그램 전체에서 사용하는 공용 공간
-> 클래스 변수는 해당 클래스가 JVM에 로딩되는 순간 생성되고 JVM이 종료될 때까지 생존
-> 가장 긴 생명 주기를 가짐
-> static = 정적
*/