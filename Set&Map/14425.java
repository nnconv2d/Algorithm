import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i=0; i<n; i++) {
            list1.add(br.readLine());
        }

        for (int i=0; i<m; i++) {
            list2.add(br.readLine());
        }

        HashSet<String> set = new HashSet<>(list1);
        HashSet<String> strs = new HashSet<>(list2);

        HashSet<String> intersection = new HashSet<>(set);
        intersection.retainAll(strs);

        System.out.print(intersection.size()+"");
    }
}
