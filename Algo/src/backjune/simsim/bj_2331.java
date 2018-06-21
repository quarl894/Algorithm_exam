package backjune.simsim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2331 {
    static ArrayList<Integer> arr = new ArrayList<>();

    static int P;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(stk.nextToken());
        P = Integer.parseInt(stk.nextToken());
        arr.add(A);

        System.out.println(result(A));
        br.close();
    }

    private static int result(int N){
        int sum =0;
        double tmp = 0;

        while(N>0){
            tmp = N % 10;
            sum += Math.pow(tmp, P);
            N /= 10;
        }
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == sum) return i;
        }
        arr.add(sum);
        return result(sum);
    }
}
