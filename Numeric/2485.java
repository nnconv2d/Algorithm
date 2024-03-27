import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] tree = new Integer[n];
        for (int i=0; i<n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        int[] d = new int[n-1]; // distances between trees. length = n-1
        for (int i=0; i<n-1; i++) {
            d[i] = tree[i+1] - tree[i];
        }
        Arrays.sort(d);

        int gcd = getGcd(d[n-2], d[n-3]);
        for (int i=n-3; i>=0; i--) {
            gcd = getGcd(d[i], gcd);
        }

        int count = 0;
        List<Integer> treeArray = new ArrayList<>(Arrays.asList(tree));
        for (int i=tree[0]; i<=tree[n-1]; i+=gcd) {
            if (!treeArray.contains(i)) {
                count++;
            }
        }

        System.out.println(count);

    }

    private static int getGcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (true) {
            int remain = max%min;
            if (remain == 0) {
                return min;
            } else {
                max = min;
                min = remain;
            }
        }
    }
}
