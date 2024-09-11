package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User();
    }
}

/*
1. 사용자와 같은 위치
PackageMain1과 Data는 같은 패키지(pack)에 위치 -> 패키지 경로를 생략 가능

2. 사용자와 다른 위치
PackageMain1과 User는 서로 다른 패키지(User는 pack.a)에 위치 -> 패키지 전체 경로를 포함해서 클래스를 적어주어야 함
*/