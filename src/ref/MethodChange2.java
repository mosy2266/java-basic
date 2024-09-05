package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}

/*
<동작 과정>
1. Data 인스턴스를 생성, 해당 인스턴스의 참조값을 변수 dataA에 담음
2. dataA에 저장된 인스턴스의 참조값을 통해 멤버 변수(필드) value에 10을 할당
3. 메서드를 호출 -> 이때 매개변수 dataX에 dataA의 참조값이 복사되어 대입됨
4. 매개변수 dataX는 dataA의 참조값을 갖고 있으므로, dataA와 동일한 Data 인스턴스를 가리킴
5. 메서드 내부에서 dataX.value = 20을 통해 해당 멤버 변수(필드)에 새로운 값을 대입
6. 이때 dataX와 dataA가 모두 같은 Data 인스턴스를 참조하므로 dataA.value와 dataX.value 또한 같은 값을 가짐
7. 출력 결과 메서드의 동작 결과가 반영됨을 확인 가능

자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달됨
단, 이 값이 실제 값이냐 참조값(메모리 주소)이냐에 따라 동작이 달라짐

<결론>
파라미터가 기본형일 때 :
메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달됨 -> 메서드 내부에서 매개변수의 값을 변경해도, 호출자의 변수 값에는 영향 X

파라미터가 참조형일 때 :
메서드로 참조형 데이터를 전달하면, 참조값(메모리 주소)이 복사되어 전달됨 = 호출자와 매개변수가 동일한 객체를 가리키게 됨
-> 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수(필드)를 변경하면, 호출자의 객체도 변경됨
*/

