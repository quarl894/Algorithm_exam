package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_11004 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(" ");

        int n = Integer.parseInt(t[0]);
        int k = Integer.parseInt(t[1]);
        long[] arr = new long[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int num = 0;
        while(stk.hasMoreTokens()){
            arr[num++] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        br.close();
    }
}
