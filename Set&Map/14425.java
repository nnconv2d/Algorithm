import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        List<String> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            list.add(br.readLine());
        }

        HashSet<String> set = new HashSet<>(list);

        for (int i=0; i<m; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                count++;
            }
        }

        System.out.print(count);

        br.close();
    }
}
