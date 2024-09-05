package ref;

/*
참조형 변수에는 항상 객체의 위치를 가리키는 참조값이 들어감
그런데 만약 아직 가리키는 대상이 없거나, 나중에 입력하고 싶다면?
-> null이라는 특별한 값을 사용함
*/

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data);
    }
}

/*
<실행 결과>
1. data = null
2. data = ref.Data@1d81eb93
3. data = null

Data 타입을 받을 수 있는 참조형 변수 data에 null을 할당 -> 해당 변수는 아직 가리키는 객체가 없다는 뜻!
이후 새로운 Data 객체를 생성해 그 참조값을 변수 data에 할당 -> 해당 변수가 참조할 객체가 존재
다시 변수 data에 null을 할당 -> 앞서 만든 Data 인스턴스를 더는 참조하지 않음

<Garbage Collection(GC) : 아무도 참조하지 않는 인스턴스는 어떻게 되나?>
위 예시에서 data에 null을 할당하면 만들어 둔 Data 인스턴스를 더는 아무도 참조하지 않음
어떤 인스턴스를 아무도 참조하지 않으면 해당 인스턴스의 참조값을 다시 구할 방법이 없음!!!
그럼 그 인스턴스는 사용되지도 않고 메모리만 잡아먹게 됨
-> JVM의 가비지 컬렉터(Garbage Collector)가 더이상 사용되지 않는 인스턴스라고 판단, 해당 인스턴스를 자동으로 메모리에서 제거해줌
*/