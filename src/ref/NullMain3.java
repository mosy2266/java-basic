package ref;

/*
NullMain2에서처럼 지역 변수의 경우에는 null 문제를 파악하는 것이 어렵지 않으나
아래 코드처럼 멤버 변수가 null인 경우에는 주의가 필요
*/

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}

/*
<실행 결과>
bigData.count = 0
bigData.data = null
Exception in thread "main" java.lang.NullPointerException: Cannot read field "value" because "bigData.data" is null
at ref.NullMain3.main(NullMain3.java:15)

bigData.count는 0으로 초기화됨
bigData.data는 null로 초기화됨
bigData.data.value로 접근하면 data의 값이 null이므로 NullPointerException 발생
*/