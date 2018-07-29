package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_1806 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n =Integer.parseInt(tmp[0]);
        long s = Long.parseLong(tmp[1]);
        int l = 0;
        int r = 0;
        int ans = 1;
        long min = Long.MAX_VALUE;

        String[] arr = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        long sum = a[0];

        while(l<=r && r<n){
            if(l==0 && r==n-1){
                min = 0;
                break;
            }
            if(sum>=s){
                min = Math.min(min,ans);
                sum -=a[l];
                l++;
                ans--;
            }else{
                r++;
                if(r==n) break;
                sum +=a[r];
                ans++;
                if(l>=r && l<n){
                    sum = a[l];
                    r = l;
                    ans =1;
                }
            }
        }
        System.out.println(min);
    }
}
