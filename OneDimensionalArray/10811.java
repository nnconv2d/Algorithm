import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] copy = new int[n+1];

        for (int i=0; i<=n; i++) {
            arr[i] = i;
            copy[i] = i;
        }
        for (int a=0; a<m; a++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for (int b=0; b<=j-i; b++) {
                arr[i+b] = copy[j-b];
            }
        }

        for (int i=1; i<=n+1; i++) {
            bw.write(arr[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
