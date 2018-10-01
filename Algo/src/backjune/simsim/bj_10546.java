package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj_10546 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine()) *2-1;
        HashMap<String,Integer> hash = new HashMap<>();
        ArrayList<String> name = new ArrayList<>();


        while(n-->0){
            String str = br.readLine();
            if(hash.containsKey(str)){
                hash.put(str,hash.get(str)+1);
            }else{
                hash.put(str,1);
                name.add(str);
            }
        }
        for(String s : name){
            if(hash.get(s)%2!=0){
                System.out.println(s);
                break;
            }
        }
        br.close();
    }
}
