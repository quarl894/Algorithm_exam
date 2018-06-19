package backjune.simsim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] clas = br.readLine().split(" ");
        String[] sp = br.readLine().split(" ");
        int B = Integer.parseInt(sp[0]);
        int C = Integer.parseInt(sp[1]);
        long count =0;

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(clas[i]) - B;
            count++;
            if(num>0){
                int tmp = num / C;
                count += tmp;
                if(num%C !=0) count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
