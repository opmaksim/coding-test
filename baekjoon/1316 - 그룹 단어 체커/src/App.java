import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());
        int count = T; // �׷� �ܾ��� ������ ī��Ʈ�ϴ� ����
        for (int i = 0; i < T; i++) {
            String word = bf.readLine(); // �ܾ ���ڿ��� �Է¹���
            boolean[] alphabet = new boolean[26]; // ���ĺ��� ���Դ��� üũ�ϴ� �迭
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j); // �ܾ�� j��° ����
                if (j > 0 && c != word.charAt(j-1)) { // ���� ���ڿ� �ٸ���
                    if (alphabet[c-'a']) { // �̹� ���� ���� �ִ� ������ ���
                        count--;
                        break;
                    }
                    else { // ó�� ���� ������ ���, üũ
                        alphabet[word.charAt(j-1)-'a'] = true;
                    }
                }
                if (j == word.length()-1) { // ������ ������ ���
                    if (alphabet[c-'a']) { // �̹� ���� ���� �ִ� ������ ���
                        count--;
                    }
                }
            }
        }
        bw.write(String.valueOf(count)); // ī��Ʈ ���
        bw.flush();
        bf.close();
        bw.close();
    }
}