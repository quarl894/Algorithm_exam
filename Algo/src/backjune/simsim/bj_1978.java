package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bj_1978 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        boolean[] chk = new boolean[1001];
        chk[2] = true;
        int ans = 0;

        //소수 만들기
        for(int i=2; i<1000; i++){
            for(int j =0; j<prime.size(); j++){
                if(i%prime.get(j)==0) break;

                if(j+1==prime.size()){
                    prime.add(i);
                    chk[i] = true;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(chk[Integer.parseInt(tmp[i])]) ans++;
        }
        System.out.println(ans);
        br.close();
    }
}
