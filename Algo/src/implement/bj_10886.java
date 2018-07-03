package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
1이면 귀엽 0이면 안귀엽
체크해서 더 많은거 출
 */
public class bj_10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count0=0;
        int count1=0;
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            int num = Integer.parseInt(br.readLine());
            if(num==0) count0++;
            else count1++;
        }
        if(count0>count1) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
        br.close();
    }
}
