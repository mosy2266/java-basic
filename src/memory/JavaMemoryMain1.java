package memory;

/*
<자바의 메모리 구조>
1. 메서드 영역(Method Area) : 프로그램을 실행하는 데에 필요한 공통 데이터 관리 -> 해당 영역은 프로그램의 모든 영역에서 공유
    - 클래스 정보 : 클래스의 실행 코드(바이트 코드), 필드, 메서드와 생성자 코드 등
    - static 영역 : static 변수들을 보관
    - 런타임 상수 풀 : 프로그램을 실행하는 데 필요한 공통 리터럴 상수 보관(참고로 문자열을 다루는 문자열 풀은 자바 7부터 힙 영역으로 이동)
2. 스택 영역(Stack Area) : 자바 실행 시 하나의 실행 스택이 생성 -> 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함
    - 스택 프레임 : 메서드를 호출할 때마다 하나의 스택 프레임이 만들어지고 쌓임 -> 메서드가 종료되면 해당 스택 프레임이 제거됨
3. 힙 영역(Heap Area) : 객체(인스턴스)와 배열이 생성되는 영역
    - GC(가비지 컬렉션)이 이루어지는 주요 영역, 더이상 참조되지 않는 객체가 GC에 의해 제거됨
*/

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end"); // ctrl+w -> 단어 선택
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}

/*
<실행 결과>
main start
method1 start
method2 start
method2 end
method1 end
main end
-> 시작 순서의 역순으로 메서드가 종료되는 것을 볼 수 있음

1. 자바 프로그램을 실행하면 main()을 실행 -> main()을 위한 스택 프레임이 하나 생성
    1-1. main() 스택 프레임은 내부에 args라는 매개변수를 가짐
2. main()은 method1()을 호출 -> method1() 스택 프레임이 하나 생성
    2-1. method1()은 m1, cal 지역 변수(매개변수도 포함됨)를 가짐 -> 해당 지역 변수들이 스택 프레임에 포함
3. method1()은 method2()를 호출 -> method2() 스택 프레임이 하나 생성
    3-1. method2()는 m2 지역 변수(매개변수도 포함됨)를 가짐 -> 해당 지역 변수가 스택 프레임에 포함
4. method2()가 종료 -> method2() 스택 프레임이 제거, 매개변수 m2도 제거
    4-1. method2() 스택 프레임이 제거되었으므로 프로그램은 method1()에서 method2()를 호출한 지점으로 되돌아감
5. method1()이 종료 -> method1() 스택 프레임과 지역 변수(매개변수 포함) m1, cal이 제거
    5-1. method1() 스택 프레임이 제거되었으므로 프로그램은 main()에서 method1()을 호출한 지점으로 되돌아감
6. main()이 종료 -> 더이상 호출할 메서드가 없고, 스택 프레임도 완전히 비워짐 -> 자바가 프로그램을 정리하고 종료
*/