package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/*
가장 오래걸리는 것을 가장 먼저 심어야 함.
답 : 심은 날짜 + 걸리는 시간 + 1(다음날)
 */
public class bj_9237 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        while(stk.hasMoreTokens()){
           arr.add(Integer.parseInt(stk.nextToken()));
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        int sum = 0;

        for(int i=0; i<n; i++){
            sum = arr.get(i) +(i+1);
            max = Math.max(max,sum);
        }
        System.out.println(max+1);

    }
}
