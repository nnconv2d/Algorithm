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
        int[] arrayA = new int[n];
        int[] arrayB = new int[m];
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String token = st.nextToken();
            arrayA[i] = Integer.parseInt(token);
            a.add(Integer.parseInt(token));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            String token = st.nextToken();
            arrayB[i] = Integer.parseInt(token);
            b.add(Integer.parseInt(token));
        }

        int answer = 0;

        for (int i=0; i<m; i++) {
            if (!a.contains(arrayB[i])) {
                answer++;
            }
        }
        for (int i=0; i<n; i++) {
            if (!b.contains(arrayA[i])) {
                answer++;
            }
        }

        bw.write(Integer.toString(answer));

        br.close();
        bw.flush();
        bw.close();
    }
}
