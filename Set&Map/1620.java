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
        Map<String, Integer> dict2 = new HashMap<>();

        for (int i=1; i<=n; i++) {
            String name = br.readLine();
            dict.put(i, name);
            dict2.put(name, i);
        }

        for (int i=0; i<m; i++) {
            String input = br.readLine();
            char inp = input.charAt(0);
            if (inp < 58) { // input이 숫자일 경우(자료형은 아직 String)
                bw.write(dict.get(Integer.parseInt(input)));
            } else { // input이 문자열일 경우
                bw.write(Integer.toString(dict2.get(input)));
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
