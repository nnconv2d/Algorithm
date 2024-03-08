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

        for (int i=0; i<nums.size(); i++) {
            if (!isPrime(nums)) {
                bw.write(Integer.toString(nums.get(i)));
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(List<Integer> list) {
        for (int i=2; i<=1000; i++) {
            for (int j=1; j<=1000; j++) {
                if (list.contains(i*j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
