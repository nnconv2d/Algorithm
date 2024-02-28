import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        List<String> list = new ArrayList<>();

        for (String key: map.keySet()) {
            if (map.get(key).equals("enter")) {
                list.add(key);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        for (int i=0; i<list.size(); i++) {
            bw.write(list.get(i));
            if (i!=list.size()-1) {
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
