package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 -> default 호출 불가
        //data.defaultField = 2;
        //data.defaultMethod();

        //다른 클래스 -> private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        //public 호출 가능
        data.innerAccess();
    }
}
