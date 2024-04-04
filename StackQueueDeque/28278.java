import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> stack = new ArrayList<>(); /* declare stack */

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) { /* store cmd, x from input */
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            switch (cmd) { /* determine a method which will be executed */
                case 1: push(x);
            }
        }
    }

    private static void push(int x) {
        stack.add(x);
    }

    private static int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            int pop = stack.get(stack.size()-1);
            stack.remove(pop);
            return pop;
        }
    }

    private static int getLength() {
        return stack.size();
    }
}
