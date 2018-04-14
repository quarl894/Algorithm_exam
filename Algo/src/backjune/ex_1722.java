package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//순열의 순서
public class ex_1722 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] f = new long[num+1];
        boolean[] c = new boolean[num+1];
         
        f[0] = 1;
        for(int i=1; i<=num; i++) {
            f[i] = f[i-1]*i;
        }
        String[] sp = br.readLine().split(" ");
        int check = Integer.parseInt(sp[0]);
        if(check == 1) {//num까지 순열중 where번째 순열은?
            long where = Long.parseLong(sp[1]);
            int[] arr = new int[num];
            for(int i=0 ; i<num ; i++) {
                for(int j=1; j<=num; j++) {
                    if(c[j] == true) continue;
                    if(f[num-i-1] < where) {
                        where -= f[num-i-1];
                    }else {
                        arr[i] = j;
                        c[j] = true;
                        break;
                    }
                }
            }
            for(int i=0; i<num; i++) {
                System.out.print(arr[i]+" ");
            }
             
        }else {//주어진순열이 몇번째순열?
            int[] arr = new int[num];
            for(int i=0; i<num; i++) {
                arr[i] = Integer.parseInt(sp[i+1]);
            }
             
            long result = 0;
            for(int i=0; i<num; i++) {
                for(int j=1; j<arr[i]; j++) {
                    if(c[j] == false) {
                        result += f[num-i-1];
                    }
                }
                c[arr[i]] = true;
            }
            System.out.println(result+1);
        }
    }
}
