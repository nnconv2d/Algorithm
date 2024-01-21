import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<10; i++) {
            list.add(Integer.parseInt(br.readLine())%42);
        }

        Set<Integer> set = new HashSet<>(list);
        bw.write(set.size()+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
