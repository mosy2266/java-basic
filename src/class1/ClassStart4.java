package class1;

//ClassStart3의 출력 부분을 배열을 사용하여 개선

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //Student 클래스를 기반으로 객체를 생성, student1과 student2에 각 객체의 참조값을 저장
        student1.name = "학생1"; //각 객체의 필드에 값을 채움
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        /*
        Student 타입의 변수는 Student 인스턴스의 참조값을 보관
        -> Student 배열의 각 항목도 Student 타입의 변수일 뿐이므로 Student 타입의 참조값을 보관
        */

        //Student 변수를 2개 담을 수 있는 배열 생성 -> 해당 배열에 student1과 student2 인스턴스를 보관
        Student[] students = new Student[2];
        students[0] = student1; //student1에 저장되어 있는 '참조값'을 복사하여 대입
        students[1] = student2; //student2에 저장되어 있는 '참조값'을 복사하여 대입
        //자바에서 대입은 항상 변수에 들어 있는 값을 복사!

        /*
        배열에 들어 있는 객체를 사용하려면
        1. 먼저 배열에 접근
        2. 그 다음 객체에 접근
        */
        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].score);
        //배열 접근([0],[1]을 사용해 배열의 요소에 접근) -> .(dot)을 사용해서 참조값으로 객체에 접근
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].score);
    }
}

/*
!!주의!!
변수에 인스턴스(객체) 자체가 들어 있는 게 아니라 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐임
그러므로 대입(=) 시 인스턴스가 복사되는 것이 아니라 참조값만 복사됨

-> students에는 Student 타입 배열의 참조값이 저장되어 있고, student1과 student2에는 Student 객체의 참조값이 저장되어 있음!
*/
