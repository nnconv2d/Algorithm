import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = {"c=", "c-", "d-", "dz=", "lj", "nj", "s=", "z="};
        br.close();

        for (String i : arr) {
            if (str.contains(i)) {
                str = str.replaceAll(i, "?");
            }
        }
    
        System.out.println(str.length());

    }
}
