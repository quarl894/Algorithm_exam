package backjune.simsim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class bj_2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int count =0;
        for(int i=102; i<999; i++){
            int temp = i;
            int one = temp%10;
            temp/=10;
            int two = temp%10;
            temp/=10;
            int thr = temp%10;
            if(one==two || one==thr || two==thr){}
            else if(one==0 || two==0 || thr==0){}
            else{
                hash.put(i,0);
                arr.add(i);
            }
        }
        for(int i=0; i<N; i++){
            String[] sp = br.readLine().split(" ");
            int num = Integer.parseInt(sp[0]);
            int S = Integer.parseInt(sp[1]);
            int B = Integer.parseInt(sp[2]);

            int t1 = num %10;
            num /=10;
            int t2 = num %10;
            num /=10;
            int t3 = num %10;
            for(int j=0; j<arr.size(); j++){
                ArrayList<Integer> base = new ArrayList<>();
                int result = arr.get(j);
                int one = result %10;
                result /=10;
                int two = result %10;
                result /=10;
                int thr = result %10;
                base.add(one);
                base.add(two);
                base.add(thr);
                int strike = 0;
                int ball = 0;

                if(t1==one) strike++;
                else if(base.contains(t1)) ball++;
                if(t2==two) strike++;
                else if(base.contains(t2)) ball++;
                if(t3==thr) strike++;
                else if(base.contains(t3)) ball++;

                if(S==strike && B==ball){
                    hash.replace(arr.get(j),hash.get(arr.get(j))+1);
                }

            }
        }

        for(int i=0; i<arr.size(); i++){
            if(hash.get(arr.get(i))==N) {
          //      System.out.println(arr.get(i));
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
