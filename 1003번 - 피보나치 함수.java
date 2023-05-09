import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int[] memo = new int[42];

    public static int fibonacci(int n) {
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2]; // 중복 계산을 피하기 위해 저장된 결과를 사용
        }
        return memo[n];
    }

    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());
        int[] arr = new int[T];
        int[] arr2 = new int[T];
        int num = 0;
        for (int i = 0; i < T; i++) {
            num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                arr[i] = 1;
                arr2[i] = 0;
            } else if (num == 1) {
                arr[i] = 0;
                arr2[i] = 1;
            } else {
                fibonacci(num);
                arr[i] = memo[num - 1];
                arr2[i] = memo[num - 2] + memo[num-1];
            }
        }
        for (int i = 0; i < T; i++) {
            bw.write(String.format("%d %d\n", arr[i], arr2[i]));
        }
        bf.close();
        bw.close();
    }
}
