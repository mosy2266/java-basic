package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}

/*
<실행 결과>
A count = 1
B count = 2
C count = 3
-> Data2 인스턴스를 생성할 때마다 생성자를 통해 Counter 인스턴스에 있는 count 값을 1씩 증가시킴
-> 원하던 동작!

근데 불편한 점이 조금 있음
1. Data2 클래스와 관련된 동작인데 Counter라는 별도의 추가 클래스를 사용해야 함
2. 생성자에 매개변수가 추가 -> 생성자가 복잡해지고, 생성자를 호출하는 부분도 복잡해짐

이걸 어떻게 개선할 수 있을까? -> static 키워드의 사용
*/
