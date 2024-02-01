import java.io.*;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        List<Character> chars = new ArrayList<>();
        for (char ch: str.toCharArray()) {
            chars.add(ch);
        }
        int count = 0;
        List<String> cr = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        int len = chars.size();

        for (int i=0; i<len; i++) {
            if (i+1 < len) {
                if (cr.contains(cr.get(i) + cr.get(i+1))) {
                    count += 1;
                } else if ((cr.get(i) + cr.get(i+1)) == "dz") {
                    if (i+2 < len) {
                        if (cr.contains(cr.get(i) + cr.get(i+1) + cr.get(i+2))) {
                            count += 1;
                        }
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
