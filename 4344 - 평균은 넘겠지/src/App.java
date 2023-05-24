import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt(); // 학생 수
            int[] scores = new int[n]; // 점수 배열
            int sum = 0;
            double average = 0;

            // 점수 입력받기
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            // 평균 계산하기
            average = (double) sum / n;

            // 평균을 넘는 학생의 비율 계산하기
            int count = 0;
            for (int score : scores) {
                if (score > average) {
                    count++;
                }
            }
            double ratio = (double) count / n * 100;

            // 결과 출력하기
            System.out.printf("%.3f%%\n", ratio);
        }
    }
}