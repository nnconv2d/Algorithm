import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();
        String str = br.readLine();

        for (int i=0; i<str.length(); i++) {
            int len = i+1;
            while (len<=str.length()) {
                set.add(str.substring(i, len));
                len++;
            }
        }

        bw.write(Integer.toString(set.size()));

        br.close();
        bw.flush();
        bw.close();
    }
}
