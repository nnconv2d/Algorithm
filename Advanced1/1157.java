import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine().toLowerCase();
        List<Character> list = new ArrayList<>();
        for (char i: str.toCharArray()) {
            list.add(i);
        }
        HashSet<Character> temp = new HashSet<>(list);
        List<Character> set = new ArrayList<>(temp);
        int max = 0;
        char character = ' ';

        for (int i=0; i<set.size(); i++) {
            int count = 0;
            for (int j=0; j<list.size(); j++) {
                if (set.get(i) == list.get(j)) {
                    count ++;
                }
            }
            if (max < count) {
                max = count;
                character = Character.toUpperCase(set.get(i));
            } else if (max == count) {
                character = '?';
            }
        }

        bw.write(character+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
