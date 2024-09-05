package ref;

//class1.ClassStart3 코드에서 중복되는 부분(name, age, grade에 값을 할당하고 학생 정보 출력) -> 메서드를 사용해 리팩토링
//ref 패키지에도 Student 클래스를 따로 만들었음

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    //전달받은 학생 객체의 필드값에 값을 설정하는 메서드
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    //전달받은 학생 객체의 필드값을 출력하는 메서드
    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
    }
}
