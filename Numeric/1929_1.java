import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n+1];

        for (int i=0; i<=n; i++) { // 배열 초기화
            nums[i] = i;
        }

        for (int i=2; i<=Math.sqrt(n); i++) {
            if (nums[i] == 0) continue;
            for (int j=i*2; j<=n; j+=i) {
                nums[j] = 0;
            }
        }

        StringBuffer sb = new StringBuffer();

        for (int i=m; i<=n; i++) {
            if (nums[i] != 0 && nums[i] != 1) {
                sb.append(i+"\n");
            }
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
