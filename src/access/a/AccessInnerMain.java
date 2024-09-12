package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 -> default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //다른 클래스 -> private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        //AccessData.innerAccess() 메서드는 public -> 외부에서 호출 가능
        data.innerAccess(); //외부에서 호출 되었지만 해당 메서드 자체는 AccessData에 포함 -> private 필드와 메서드에 접근 가능
    }
}
