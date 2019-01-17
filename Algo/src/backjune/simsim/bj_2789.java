package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_2789 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Character> hash = new HashSet<>();
        char[] no = "CAMBRIDGE".toCharArray();
        for(char c : no) hash.add(c);

        char[] str = br.readLine().toCharArray();
        StringBuilder st = new StringBuilder();

        for(char c : str){
            if(!hash.contains(c)) st.append(c);
        }

        System.out.println(st.toString());
        br.close();
    }

}
