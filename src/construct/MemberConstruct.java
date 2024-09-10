package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //이 부분이 생성자
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 : name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //생성자 추가(생성자의 오버로딩)
    MemberConstruct(String name, int age) {
        //단, this()는 생성자 코드의 "첫 줄"에만 작성할 수 있음!!!!
        this(name, age, 50); //this를 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있음 -> 중복 제거 가능
    }
    /*
    위 생성자(매개변수가 두 개인) 내부에서 다른 생성자(매개변수가 세 개인)를 호출
    */
}

/*
생성자 규칙
1. 생성자의 이름은 "클래스"의 이름과 같아야 함 -> 첫 글자도 대문자로 시작
2. 생성자는 반환 타입이 없으므로 비워두어야 함
3. 나머지는 메서드와 동일
*/