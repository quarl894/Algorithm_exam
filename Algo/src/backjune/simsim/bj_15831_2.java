package backjune.simsim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bj_15831_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int N = Integer.parseInt(sp[0]);
        int B = Integer.parseInt(sp[1]);
        int W = Integer.parseInt(sp[1]);
        int len = 0;
        int result = 0;

        char[] stone = br.readLine().toCharArray();
        ArrayList<Integer> st = new ArrayList<>();
        for(int i=0; i<stone.length; i++){
            if(stone[i]=='B') st.add(i);
        }

        if(st.size()-B >0) {
            for (int i = 0; i < st.size() - B; i++) {
                int tmp = i + B + 1;
                result = st.get(B);
                if (tmp < st.size()) len = st.get(i + B) - st.get(i) - 1;
                else len = stone.length - st.get(st.size() - B - 1) - 1;
                if(result <len && st.get(i)>=W) result = len; //아 모르겠다
            }
        }else{
            if(stone.length - st.size() >=W){
                result = stone.length;

            }
            else result = 0;
        }
        System.out.println(result);
        br.close();
    }
}
