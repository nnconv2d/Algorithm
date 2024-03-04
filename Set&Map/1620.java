import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> a = makeSet();
        Set<Integer> b = makeSet();
        Set<Integer> intersection = copySet(a); // 깊은 복사로 생성(addAll 써도 얕은 복사)

        intersection.retainAll(b); // intersection: 교집합
        a.removeAll(intersection); // a-b
        b.removeAll(intersection); // b-a
        a.addAll(b);
        bw.write(Integer.toString(a.size()));

        br.close();
        bw.flush();
        bw.close();
    }

    public static Set<Integer> makeSet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> a = new HashSet<>();
        while (st.hasMoreTokens()) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        return a;
    }

    public static Set<Integer> copySet(Set<Integer> original) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer a : original) {
            newSet.add(a);
        }
        return newSet;
    }
}
