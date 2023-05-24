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
        int count = T; // 그룹 단어의 개수를 카운트하는 변수
        for (int i = 0; i < T; i++) {
            String word = bf.readLine(); // 단어를 문자열로 입력받음
            boolean[] alphabet = new boolean[26]; // 알파벳이 나왔는지 체크하는 배열
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j); // 단어에서 j번째 문자
                if (j > 0 && c != word.charAt(j-1)) { // 이전 문자와 다르면
                    if (alphabet[c-'a']) { // 이미 나온 적이 있는 문자인 경우
                        count--;
                        break;
                    }
                    else { // 처음 나온 문자인 경우, 체크
                        alphabet[word.charAt(j-1)-'a'] = true;
                    }
                }
                if (j == word.length()-1) { // 마지막 문자인 경우
                    if (alphabet[c-'a']) { // 이미 나온 적이 있는 문자인 경우
                        count--;
                    }
                }
            }
        }
        bw.write(String.valueOf(count)); // 카운트 출력
        bw.flush();
        bf.close();
        bw.close();
    }
}