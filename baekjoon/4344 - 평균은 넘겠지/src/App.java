import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt(); // �л� ��
            int[] scores = new int[n]; // ���� �迭
            int sum = 0;
            double average = 0;

            // ���� �Է¹ޱ�
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            // ��� ����ϱ�
            average = (double) sum / n;

            // ����� �Ѵ� �л��� ���� ����ϱ�
            int count = 0;
            for (int score : scores) {
                if (score > average) {
                    count++;
                }
            }
            double ratio = (double) count / n * 100;

            // ��� ����ϱ�
            System.out.printf("%.3f%%\n", ratio);
        }
    }
}