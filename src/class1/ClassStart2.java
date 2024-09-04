package class1;

//ClassStart1의 개선 -> 배열을 사용

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentScores = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentScores[i]);
        }
    }
}

/*
학생 한 명의 데이터가 세 개의 배열에 나눠져 있음
-> 학생 한 명의 데이터를 관리하기 위해 배열 세 개를 모두 변경해야 하고 심지어 인덱스 순서까지 정확히 맞춰야 함
-> 데이터 변경 소요 발생 시 매우 조심해야 함
-> 사람이 관리하기에 좋은 코드가 아님
*/
