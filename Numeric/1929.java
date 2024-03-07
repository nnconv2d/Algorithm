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

        for (int i=m; i<=n; i++) {
            nums.add(i);
        }

        for (int i)

        for (int i=0; i<nums.size(); i++) {
            bw.write(Integer.toString(nums.get(i)));
        }


        br.close();
        bw.flush();
        bw.close();
    }
}
