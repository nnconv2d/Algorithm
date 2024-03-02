import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<Integer, String> dict = new HashMap<>();

        for (int i=1; i<=n; i++) {
            dict.put(i, br.readLine());
        }

        for (int i=0; i<m; i++) {
            String input = br.readLine();
            int len = input.length();
            if (len == 1) { // input이 숫자일 경우(자료형은 아직 String)
                bw.write(dict.get(Integer.parseInt(input)));
            } else { // input이 문자열일 경우
                for (int key : dict.keySet()) {
                    if (dict.get(key).equals(input)) {
                        bw.write(Integer.toString(key));
                    }
                }
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
