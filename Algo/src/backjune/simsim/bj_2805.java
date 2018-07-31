package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_2805 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        long m = Long.parseLong(tmp[1]);
        long tree[] = new long[n];
        long r = 0;
        String[] tmp2 = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            tree[i] = Long.parseLong(tmp2[i]);
            r = Math.max(tree[i],r);
        }
       // Arrays.sort(tree);

        long l = 0;
        long mid = (l+r) /2;
        long sum = 0;
        long result = 0;
        while(l<=r){
            mid = (l+r) /2;
            sum = 0;
            for(int i=0; i<n; i++){
                if(mid<tree[i]){
                    sum += (tree[i] - mid);
                }
            }
            if(sum >=m){
                // mid에 도착해도 최대값이 아닐 수 있다.
                if(result<mid) result = mid;
                l = mid +1;
            }else{
                r = mid-1;
            }
        }
        System.out.println(result);
        br.close();
    }
}
