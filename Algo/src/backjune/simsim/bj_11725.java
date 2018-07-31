package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bj_11725 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<xy> arr= new ArrayList<>();
        StringBuilder st = new StringBuilder();
        for(int i=0; i<n-1; i++){
            String[] tmp = br.readLine().split(" ");
            arr.add(new xy(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1])));
        }

        Collections.sort(arr, new Comparator<xy>() {
            @Override
            public int compare(xy o1, xy o2) {
                if(o1.y>o2.y)
                    return 1;
                else{
                    return -1;
                }
            }
        });

        for(xy a: arr) st.append(a.x+"\n");
        System.out.println(st.toString());
        br.close();
    }

    private static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
