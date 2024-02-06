import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        List<Character> list = new ArrayList<>();


        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (char ch: str.toCharArray()) {
                list.add(ch);
            }
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
