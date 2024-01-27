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
        int w = 0;
        int[] card = new int[n];
        st = new StringTokenizer(br.readLine());
        int count = 0;
        int max = 0;

        while (w<n) {
            card[w] = Integer.parseInt(st.nextToken());
            w++;
        }

        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    count = card[i] + card[j] + card[k];
                    if (count <= m && count > max) {
                        max = count;
                    }
                }
            }
        }

        bw.write(Integer.toString(max));

        br.close();
        bw.flush();
        bw.close();
    }
}
