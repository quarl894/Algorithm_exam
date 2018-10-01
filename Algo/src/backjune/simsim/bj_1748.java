package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_1748 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = String.valueOf(n).length();

        while(n-->1){
            String str = String.valueOf(n);
            ans +=str.length();
        }
        System.out.println(ans);
        sc.close();
    }
}
