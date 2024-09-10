package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}

/*
new MemberInit() << 매개변수가 없음!
이처럼 매개변수가 없는 생성자를 "기본 생성자"라고 함
클래스에 생성자가 하나도 없으면 자바 컴파일러는 "매개변수가 없고 작동하는 코드가 없는" 기본 생성자를 자동으로 만들어줌
단, 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않음
*/
