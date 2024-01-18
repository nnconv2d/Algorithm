import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] array = new int[n + 1];
        int tmp = 0;
        for (int i = 1; i < n + 1; i++) {
            array[i] = i;
        }

        for (int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        for (int i=1; i<n+1; i++) {
            if (i == n) {
                bw.write(array[i] + "");
            } else {
                bw.write(array[i] + " ");
            }
        }

            br.close();
            bw.flush();
            bw.close();
    }
}
