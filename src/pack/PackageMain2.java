package pack;

import pack.a.User; //import  -> 다른 패키지에 있는 클래스를 가져와서 사용 가능

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); //import 사용으로 패키지명 생략 가능
    }
}

//참고로 특정 패키지에 포함된 모든 클래스를 사용하고 싶으면 import 시점에 *을 사용하면 됨 ex) import pack.a.*;