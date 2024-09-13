package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}

/*
deco() 메서드를 호출하기 위해 DecoUtil1의 인스턴스를 먼저 생성해야 함!
-> 그런데 deco()는 멤버 변수도 없고 단순 기능만 제공할 뿐
-> 인스턴스는 멤버 변수(인스턴스 변수) 등을 사용하는 목적이 큼
-> 더 나은 방법이 없을까?
*/