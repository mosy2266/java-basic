package class1;

//ClassStart4의 리팩토링

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        //배열 선언
        Student[] students = new Student[]{student1, student2};
        /*
        생성과 선언을 동시에 하는 경우 다음과 같이 최적화 가능
        Student[] students = {student1, student2};
        */

        //for문 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name + " 나이 : " +
                    students[i].age + " 성적 : " + students[i].score);
        }

        //반복 요소를 변수에 담을 수도 있음
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름 : " + s.name);
        }

        //향상된 for문
        for (Student s : students) {
            System.out.println("이름 : " + s.name);
        }
    }
}
