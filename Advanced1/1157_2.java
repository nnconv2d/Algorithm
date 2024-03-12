import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = (br.readLine().toUpperCase()).toCharArray();
        Map<Character, Integer> words = new HashMap<>();

        for (int i=0; i<chars.length; i++) {
            if (words.containsKey(chars[i])) {
                words.replace(chars[i], words.get(chars[i])+1);
            } else {
                words.put(chars[i], 1);
            }
        }

        System.out.println(findMaxUsedAlphabet(words));

        br.close();
        bw.flush();
        bw.close();
    }

    private static char findMaxUsedAlphabet(Map<Character, Integer> word) {
        List<Integer> values = new ArrayList<>();
        List<Character> keys = new ArrayList<>();

        for (char key : word.keySet()) {
            keys.add(key);
            values.add(word.get(key));
        }

        int max = Collections.max(values);
        int index = 0;
        int count = 0;

        for (int i : values) {
            if (i==max) {
                index = values.indexOf(i);
                count++;
            }
        }

        if (count >= 2) {
            return '?';
        } else {
            return keys.get(index);
        }

    }
}
