package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); //ctrl+p = 파라미터 정보 알 수 있음
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}

/*
생성자 호출 -> 생성자는 인스턴스를 생성하고 나서 즉시 호출됨
new 생성자이름(생성자에 맞는 인수들)

<생성자의 장점>
1. 중복 호출 제거 -> 객체를 생성하면서 동시에 생성 직후 필요한 작업을 한번에 처리 가능
2. 객체를 생성할 때 직접 정의한 생성자가 있다면 그 생성자를 "반드시" 호출해야 함
    -> 이게 왜 장점이지?
    -> 직접 정의한 생성자를 호출하지 않으면 컴파일 오류가 발생
    -> 아무 정보도 없는 유령 객체가 시스템 내부에 등장할 가능성 원천 차단
    -> 필수값의 입력을 보장할 수 있음!!
*/