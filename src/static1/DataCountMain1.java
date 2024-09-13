package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);
    }
}

/*
<실행 결과>
A count = 1
B count = 1
C count = 1
-> 기대한 대로 작동하지 않음
-> 왜냐? 객체를 생성할 때마다 Data1 인스턴스는 새로 만들어지고, 인스턴스에 포함된 count 변수도 새로 만들어지기 때문(서로 공유 X)
-> 이 문제를 해결하려면 변수를 서로 공유해야 함!!
*/