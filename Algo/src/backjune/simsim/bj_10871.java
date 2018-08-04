package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_10871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        String[] tmp = br.readLine().split(" ");
        int num = 0;
        StringBuilder st = new StringBuilder();
        for(int i=0; i<n; i++){
            num = Integer.parseInt(tmp[i]);
            if(x>num) st.append(num + " ");
        }
        System.out.println(st);
        br.close();

    }
}
