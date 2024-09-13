package static2;

//정적 메서드를 사용할 때 해당 메서드를 자주 호출해야 한다면 import static을 고려

//import static static2.DecoData.staticCall; -> 특정 클래스의 정적 메서드 하나에만 적용하려면 생략할 메서드 명을 적어줌
import static static2.DecoData.*; //특정 클래스의 모든 정적 메서드에 적용하려면 이 코드처럼 *을 사용

//import static은 정적 변수에도 사용할 수 있음

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        //DecoData.staticCall();
        staticCall(); //import static을 통해 클래스 명을 생략하고 메서드를 호출할 수 있게 됨

        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //노란 줄이 뜸 : 인스턴스를 통해 정적 메서드에 접근하고 있다고 알려주는 중

        //클래스를 통한 접근
        DecoData.staticCall();

        /*
        <추가한 부분 실행 결과>
        staticValue = 4
        staticValue = 5
        -> 둘의 차이는 없음. 결과적으로 둘 모두 정적 메서드에 접근

        단, 정적 메서드에 접근하는 경우 클래스를 통한 접근 방법을 추천
        -> 인스턴스를 통한 접근 방법을 사용하면 인스턴스 메서드에 접근하는 것처럼 오해할 수 있기 때문!!
        */
    }
}

/*
<출력 결과>
1. 정적 호출
staticValue = 1
2. 인스턴스 호출 1
instanceValue = 1
staticValue = 2
3. 인스턴스 호출 2
instanceValue = 1
staticValue = 3

<정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유>
정적 메서드는 클래스의 이름을 통해 바로 호출 가능 -> 인스턴스처럼 '참조값'의 개념이 없음
특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데, 정적 메서드는 참조값 없이 호출
-> 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없음

물론 아래 예시처럼 객체의 참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스 변수나 인스턴스 메서드 호출 가능

public static void staticCall(DecoData data){
    data.instanceValue++;
    data.instanceMethod();
}

<main() 메서드는 정적 메서드>
main() 메서드 = 프로그램을 시작하는 시작점 -> 객체를 생성하지 않아도 main()이 작동 -> static이기 때문!

정적 메서드는 같은 클래스 내부에서 정적 메서드만 호출 가능!
-> main() 메서드가 같은 클래스에서 호출하는 다른 메서드 또한 정적 메서드로 선언해서 사용
*/
