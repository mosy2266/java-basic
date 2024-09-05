package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data(); //dataA는 Data형 객체의 참조값을 저장하는 참조형 변수
        dataA.value = 10; //객체의 value 변수에 10을 저장
        Data dataB = dataA; //dataA에 저장된 객체의 참조값을 복사해서 dataB에 대입

        /*
        !!주의!! dataA가 가리키는 인스턴스 자체를 복사하는 게 아니라 변수에 들어있는 참조값만 복사해서 대입하는 것
        -> dataA와 dataB에 들어있는 참조값이 같다 = 같은 Data 인스턴스를 가리킨다!
        */

        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA를 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value -> 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB를 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value -> 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //그래서 dataA를 통해 객체에 접근한 결과와 dataB를 통해 접근한 결과가 동일하다!!
    }
}