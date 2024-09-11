package pack; //패키지를 사용하는 경우 항상 코드 첫줄에 패키지 이름을 적어줘야 함

public class Data {
    public Data() { //생성자에 public 사용 -> 다른 패키지에서 해당 클래스의 생성자를 호출하기 위해 필요한 접근 제어자
        System.out.println("패키지 pack Data 생성");
    }
}
