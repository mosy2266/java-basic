package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

/*
this의 기능

initMember()의 매개변수 이름과 MemberInit의 멤버 변수 이름이 같음
-> 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있으므로 매개변수가 우선순위를 가짐!!
-> 그래서 initMember() 메서드 안에서 그냥 name이라고 적으면 매개변수에 접근하게 됨
-> 이때 멤버 변수에 접근하기 위해 사용하는 것이 this, 이때 this는 인스턴스 자신의 참조값을 가리킴

this.name = name;
-> 왼쪽의 this.name은 MemberInit의 멤버 변수(필드)에 접근
-> 오른쪽의 name은 initMember() 메서드의 매개변수에 접근

name = name; 이라고 하면 둘 다 매개변수에 접근하므로 멤버 변수의 값이 변경되지 않음!!

<정리>
클래스 내부 멤버 변수(필드)의 이름과 클래스 내부 메서드의 매개변수의 이름이 같은 경우, 멤버 변수를 참조할 때 this를 사용해 명확히 구분!!
this는 인스턴스 자신을 가리킴
단, 멤버 변수와 매개변수의 이름이 서로 다르면 생략 가능
*/
