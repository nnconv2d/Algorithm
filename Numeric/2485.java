import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];
        for (int i=0; i<n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int[] distance = new int[n-1];
        for (int i=0; i<n-1; i++) {
            distance[i] = trees[i+1] - trees[i];
        }

        Arrays.sort(distance);
        int min = distance[0];

        for (int i=min; i>0; i--) {
            for (int j: distance) {
                if (j%i != 0) break;
            }
        }

        List<Integer> newTrees = new ArrayList<>();
        Integer[] arr = Arrays.stream(trees).boxed().toArray(Integer[]::new);

        for (int i=trees[0]; i+min<=trees[n-1]; i=i+min) {
            if (!Arrays.asList(arr).contains(i+min)) {
                newTrees.add(i+min);
            }
        }

        System.out.println(newTrees);
        System.out.println(newTrees.size());
    }
}
