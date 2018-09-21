package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_11721 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();
        StringBuilder st = new StringBuilder();
        for(int i=1; i<=ch.length; i++){
            st.append(ch[i-1]);
            if(i%10==0) st.append("\n");
        }
        System.out.println(st);
        br.close();
    }
}
