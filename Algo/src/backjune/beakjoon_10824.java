package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class beakjoon_10824 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        String tmp1 = sp[0] + sp[1];
        String tmp2 = sp[2] + sp[3];

        long result = Long.valueOf(tmp1) + Long.valueOf(tmp2);
        System.out.println(result);
        br.close();
    }
}
