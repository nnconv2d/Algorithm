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
        StringBuffer sb = new StringBuffer();

        String str = br.readLine();
        List<Character> chars = new ArrayList<>();
        for (char ch: str.toCharArray()) {
            chars.add(ch);
        }
        int count = 0;
        List<String> cr = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        int len = chars.size();

        int i=0;
        while (i<len) {
            if (i+1 < len) {
                sb.append(chars.get(i)).append(chars.get(i+1));
                if (cr.contains(sb)==true) {
                    count += 1;
                    i++;
                } else if (sb.equals("dz")) {
                    if (i+2 < len) {
                        if (cr.contains(chars.get(i) + chars.get(i+1) + chars.get(i+2))==true) {
                            count += 1;
                            i += 2;
                        }
                    }
                } else {
                    count += 1;
                    i++;
                }
            }
        }

        bw.write(Integer.toString(count));

        br.close();
        bw.flush();
        bw.close();
    }
}
