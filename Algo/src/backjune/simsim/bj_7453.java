package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_7453 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        long[] b = new long[n];
        long[] c = new long[n];
        long[] d = new long[n];
        long[] sum1 = new long[n*n];
        long[] sum2 = new long[n*n];
        int l = 0;
        int r = 0;
        int ans = 0;

        for(int i=0; i<n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(stk.nextToken());
            b[i] = Integer.parseInt(stk.nextToken());
            c[i] = Integer.parseInt(stk.nextToken());
            d[i] = Integer.parseInt(stk.nextToken());
        }

        int num = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sum1[num] = a[i] + b[j];
                sum2[num] = c[i] + d[j];
                num++;
            }
        }

        Arrays.sort(sum1);
        Arrays.sort(sum2);

        while(l<=r && r<n){
            long sum = sum1[l] + sum2[r];
            if(sum<0){
                r++;
            }else if(sum==0){
                r++;
                if(r==n){
                    r--;
                    l++;
                }
                ans++;
            }else{
                l++;
                if(l>r && l<n){
                    r = l;
                }
            }
        }
        System.out.println(ans);
        br.close();


    }
}
