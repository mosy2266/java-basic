package ref;

//NullMain3의 문제를 해결한 코드

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //멤버 변수 bigData.data가 null이 아닌 참조값을 갖도록 Data 인스턴스를 만들고 할당

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}

/*
<실행 결과>
bigData.count = 0
bigData.data = ref.Data@312b1dae
bigData.data.value = 0

NullPointerException이 발생하지 않음!
*/