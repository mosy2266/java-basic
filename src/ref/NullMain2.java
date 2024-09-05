package ref;

/*
NullPointerException : 참조값이 null인데 참조하려 할 때 발생하는 예외
*/

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null; //null = 참조할 주소가 존재하지 않음
        data.value = 10; //NullPointerException이 발생!!
        System.out.println("data = " + data.value);
    }
}

/*
<실행 결과>
Exception in thread "main" java.lang.NullPointerException: Cannot assign field "value" because "data" is null
at ref.NullMain2.main(NullMain2.java:10)

참조형 변수 data에 null이 들어가 있음 -> 참조값(=메모리 주소)이 없음
이때 data.value로 참조하려 해서 java.lang.NullPointerException이 발생하고 프로그램이 종료됨
예외가 발생하면 다음 로직이 수행되지 않으므로 System.out.println()이 실행되지 않았음
*/