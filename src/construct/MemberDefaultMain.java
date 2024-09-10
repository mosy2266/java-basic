package construct;

public class MemberDefaultMain {
    public static void main(String[] args) {
        MemberDefault memberDefault = new MemberDefault();
    }
}

/*
MemberDefault에는 생성자가 하나도 없으므로 자바가 기본 생성자를 만들어줌

public class MemberDefault {
    String name;

    //기본 생성자
    public MemberDefault() {
    }
}

기본 생성자를 왜 만들어주는가?
-> 자바에서 만들어주지 않으면 생성자 기능이 필요하지 않은 경우에도 모든 클래스에 개발자가 직접 기본 생성자를 정의해야 하기 때문!!
-> 생성자 기능을 사용하지 않는 경우도 많으므로 이러한 편의 기능을 제공함

<정리>
1. 생성자는 반드시 호출되어야 함
2. 생성자가 없으면 기본 생성자가 제공됨
3. 생성자가 하나라도 있으면 기본 생성자는 제공되지 않음, 이 경우 개발자가 정의한 생성자를 직접 호출해야 함!
*/