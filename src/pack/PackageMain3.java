package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User(); //pack.a의 User를 import 했으므로 pack.b의 User는 전체 경로를 적어줌
    }
}

/*
패키지 덕분에 클래스 이름이 같아도 됨!(패키지 이름으로 구분해서 사용할 수 있음)
만약 서로 다른 패키지의 이름이 같은 두 클래스를 사용하려면 어떻게 해야 하나?
-> 자주 쓰는 클래스는 import, 비교적 덜 쓰는 클래스는 패키지를 포함한 전체 경로를 적어주는 식으로 사용

<패키지 규칙>
- 패키지 이름과 위치는 폴더(디렉토리)의 위치와 같아야 함(필수)
- 패키지 이름은 모두 소문자를 사용(관례)
- 패키지 이름의 앞 부분은 일반적으로 회사의 도메인 이름을 거꾸로 사용(관례)
    - com.company.myapp <<처럼
    - 오픈소스나 라이브러리를 만들어 외부에 제공한다면 지키는 것이 좋음

<패키지와 계층 구조>
- a
 - b
 - c
와 같이 패키지가 구성될 때, 'a', 'a.b', 'a.c'로 총 3개의 패키지가 존재하게 됨
눈으로 볼 때 계층 구조를 이루는 것(패키지 a 하위에 패키지 a.b와 a.c) 같지만 세 개의 패키지는 서로 완전히 다름
-> 패키지 a에서 a.b(또는 a.c)의 클래스가 필요하면 import해서 사용해야 함(반대의 경우도 동일)
*/