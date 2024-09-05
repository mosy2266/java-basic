package ref;

//Method1 코드에도 중복되는 부분이 존재(객체를 생성하고 초기값을 설정하는 부분) -> 이 또한 메서드를 사용해 리팩토링 가능

public class Method2 {
    public static void main(String[] args) {
        //createStudent() 메서드로 만들어진 각 Student 객체의 참조값을 변수 student1, student2에 저장
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    //Student 인스턴스(객체)를 생성하고 각 필드에 값을 할당해준 뒤 그 객체의 참조값을 반환하는 메서드
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //이 참조값만 있으면 메서드 내부에서 만들었다고 해도 해당 인스턴스에 접근할 수 있음!!
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }
}
