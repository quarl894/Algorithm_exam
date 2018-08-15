package backjune.DP;

import java.io.BufferedReader;
import java.util.Scanner;

public class bj_1676 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num =0;
        int cnt = 0;
        if(n==0){
            System.out.println(0);
            return;
        }
        while(++num<=n){
            if(num%5==0){
                cnt++;
            }

            if(num%25==0){
                cnt++;
            }

            if(num%125==0){
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
