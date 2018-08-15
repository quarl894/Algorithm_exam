package backjune.simsim;

import java.util.PriorityQueue;
import java.util.Scanner;

public class bj_2014 {
    static int k;
    static int result;
    static long[] arr;
    static PriorityQueue<Long> q;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        k = sc.nextInt();
        result = sc.nextInt();
        q= new PriorityQueue<>();
        arr = new long[k];
        for(int i=0; i<k; i++){
            arr[i] = sc.nextLong();
            q.add(arr[i]);
        }
        long cnt = 0;
        for(int i=0; i<result; i++){
            cnt = q.poll();

            for(int j=0; j<k; j++){
                long value = cnt*arr[j];
                q.add(value);

                if(cnt %arr[j]==0){
                    break;
                }
            }
        }
        System.out.println(cnt);
        sc.close();

    }
}
