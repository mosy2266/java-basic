package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
//        System.out.println(data4.count); //노란 줄이 뜸 : 인스턴스를 통해 정적 변수에 접근하고 있다고 알려주는 중

        //클래스를 통한 접근
        System.out.println(Data3.count);

        /*
        <추가한 부분 실행 결과>
        4
        4
        -> 둘의 차이가 없음. 둘 모두 결과적으로 정적 변수에 접근

        단, 정적 변수에 접근하는 경우 클래스를 통한 접근 방법을 추천
        -> 인스턴스를 통한 접근 방법을 사용하면 인스턴스 변수에 접근하는 것처럼 오해할 수 있기 때문!!
        */
    }
}

/*
<실행 결과>
A count = 1
B count = 2
C count = 3
-> static이 붙은 멤버 변수는 힙 영역(인스턴스 영역)이 아닌 메서드 영역(static 영역)에 생성되고 그곳에서 관리됨
-> Data3 인스턴스를 생성하면 생성자가 호출되고, 이때 동작하는 count++ 코드는 메서드 영역에 있는 static 변수인 count에 접근하여 값을 증가
-> 쉽게 말해 static이 붙으면, 해당 변수(필드)는 인스턴스마다 존재하는 게 아니고 메서드 영역에 '하나' 존재하게 되는 것!!

static이 붙은 정적 변수에는 (클래스 명).(변수 명)의 형식으로 접근하면 됨
    참고 : Data3의 생성자처럼 자신의 클래스에 있는 정적 변수라면 클래스명을 생략 가능
*/