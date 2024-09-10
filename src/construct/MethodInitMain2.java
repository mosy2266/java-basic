package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

/*
initMember() 메서드를 사용해 MethodInitMain1에서 반복됐던 부분을 제거
이 initMember() 메서드는 대부분 MemberInit 객체의 멤버 변수를 사용
-> MemberInit이 자기 자신의 데이터를 변경하는 기능(메서드)을 제공하는 것이 좋음
-> 객체 지향, 속성과 기능을 한 곳에 둠
*/
