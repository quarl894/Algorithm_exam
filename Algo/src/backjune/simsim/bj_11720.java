package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[] ch = br.readLine().toCharArray();
        long sum = 0;
        int num = 0;
        while(n-->0){
            sum += ch[num++] -'0';
        }
        System.out.println(sum);
        br.close();
    }
}
