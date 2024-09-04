package class1;

//학생 클래스를 사용

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; //Student 타입을 받을 수 있는 변수 student1을 선언

        /*
        객체를 생성할 때엔 new 클래스명()

        new Student()는 Student 클래스의 정보를 기반으로 새로운 객체를 생성하라는 뜻
        -> 메모리에 실제 Student 객체(인스턴스)가 생성됨

        Student 클래스는 String name, int age, int score 멤버 변수(필드)를 가짐
        -> 해당 변수들을 사용하는 데에 필요한 메모리 공간도 함께 확보
        */

        student1 = new Student(); //student1 변수는 메모리 어딘가에 생성되어 존재하는 Student 객체의 참조값을 저장

        //student1 변수에는 Student 객체의 참조값이 저장되어 있음 -> 이 변수를 통해 실제 객체에 접근(참조) 가능!
        student1.name = "학생1"; //객체에는 .(dot)을 사용해 접근
        student1.age = 15;
        student1.score = 90;

        //student2 변수에는 또 다른 Student 객체의 참조값이 저장(student1에 저장된 것과 다른 객체이므로 참조값 또한 다름)
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.score);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.score);
    }
}

/*
클래스와 사용자 정의 타입 -> 학생(Student)이라는 타입을 직접 정의했다!

사용자 정의 타입을 만들려면 클래스가 필요
클래스를 사용해서 실제 메모리에 만들어진 실체 = 객체(인스턴스)
-> 클래스를 통해 원하는 종류의 데이터 타입을 마음대로 정의할 수 있음!

------------용어 정리------------

<클래스 Class>
-객체를 생성하기 위한 틀
-객체가 가져야 할 속성(멤버 변수 또는 필드)과 기능(메서드)을 정의

<객체 Object>
-클래스에서 정의한 속성과 기능을 가진 실체
-객체들은 같은 클래스에서 만들어져도 서로 독립적인 상태를 가짐

<인스턴스 Instance>
-특정 클래스로부터 생성된 객체를 의미 -> 객체와 자주 혼용되는 단어
-주로 객체가 어떤 클래스에 속해 있는지 강조할 때 사용 ex) student1 객체는 Student 클래스의 인스턴스
-객체보다 좀 더 관계에 초점을 맞춘 용어
*/