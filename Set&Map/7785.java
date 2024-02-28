// 시간 초과

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (st.nextToken().equals("leave")) {
                list.remove(name);
            } else {
                list.add(name);
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
