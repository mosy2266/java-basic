package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); //PublicClass는 public이므로 외부에서 접근 가능
        DefaultClass1 defaultClass1 = new DefaultClass1(); //PublicClassInnerMain이 DefaultClass1과 같은 패키지 -> 접근 가능
        DefaultClass2 defaultClass2 = new DefaultClass2(); //PublicClassInnerMain이 DefaultClass2와 같은 패키지 -> 접근 가능
    }
}
