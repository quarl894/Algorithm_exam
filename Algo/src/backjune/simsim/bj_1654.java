package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_1654 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        long[] len = new long[n];
        long l = 1;
        long r = 1;
        long mid = 0;
        long result = 1;
        for(int i=0; i<n; i++){
            len[i] = Long.parseLong(br.readLine());
            r = Math.max(len[i],r);
        }
        Arrays.sort(len);

        while(l<=r){
            long sum = 0;
            mid = (l+r)/2;
                for (int i = 0; i < n; i++) {
                    //아 진짜.... 개멍청하다... >= 해야함. 그래야 같은 숫자가 1이 나오지.. 난 왜 나누면 0이라고 생각했을까....
                    if (len[i] >= mid) {
                        sum += (len[i] / mid);
                    }
            }

            if(sum >= m){
                if(result<mid){
                    result = mid;
                }
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        System.out.println(result);
        br.close();


    }
}