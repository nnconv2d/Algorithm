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
        Integer[] array = new Integer[n];

        for (int a=0; a<m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int b=i; b<j+1; b++) {
                array[b] = k;
            }
        }

        for (int i=0; i<n; i++) {
            if (array[i] == null) {
                bw.write("0");
            }
            else {
                bw.write(array[i].toString());
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
