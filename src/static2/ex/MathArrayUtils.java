package static2.ex;

public class MathArrayUtils {

    //인스턴스 생성을 막기 위함
    private MathArrayUtils() {
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static double average(int[] array) {
        double total = sum(array);
        return total / array.length;
    }

    public static int min(int[] array) {
        int min_score = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min_score > array[i]) {
                min_score = array[i];
            }
        }
        return min_score;
    }

    public static int max(int[] array) {
        int max_score = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max_score < array[i]) {
                max_score = array[i];
            }
        }
        return max_score;
    }
}
