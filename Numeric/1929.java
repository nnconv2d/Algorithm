// 시간 초과

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> nums = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            nums.add(i);
        }

        if (nums.contains(1)) {
            nums.remove(Integer.valueOf(1));
        }

        for (int i=2; i<=Math.sqrt(n); i++) {
            for (int j=i; j<=n/i; j++) {
                if (nums.contains(i*j)) {
                    nums.remove(Integer.valueOf(i*j));
                }
            }
        }

        for (int i : nums) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
