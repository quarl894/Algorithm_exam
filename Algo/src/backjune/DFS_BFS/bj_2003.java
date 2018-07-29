package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_2003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        long m = Long.parseLong(tmp[1]);
        int l =0;
        int r =0;
        int cnt = 0;
        String[] arr = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(arr[i]);
        }
        long sum = a[l];

        while(l<=r && r<n){
            if(sum==m){
                cnt++;
                r++;
                if(r==n) break;
                 sum +=a[r];
            }else if(sum>m){
                sum -=a[l];
                l++;
                if (l > r && l < n) {
                    r= l;
                    sum = a[l];
                }
            }else{
                r++;
                if(r==n) break;
                sum +=a[r];
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
