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

        int[] distance = new int[n-1];
        for (int i=0; i<n-1; i++) {
            distance[i] = tree[i+1] - tree[i];
        }
        Arrays.sort(distance);

        int min = distance[0];
        int i = 0;

        while (i < n-1) {
            if (distance[i]%min != 0) {
                min--;
                i=0;
                continue;
            }
            if (distance[i]%min == 0 && i==n-2) {
                break;
            }
            i++; 
        }

        int count = 0;

        for (int j=tree[0]; j+min<=tree[n-1]; j+=min) {
            if (!Arrays.asList(tree).contains(j)) {
                count++;
            }
        }

        System.out.println(count);

    }
}
