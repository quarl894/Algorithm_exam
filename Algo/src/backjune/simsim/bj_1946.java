package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bj_1946 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder();
        while(n-->0){
            int num = Integer.parseInt(br.readLine());
            ArrayList<staff> arr = new ArrayList<>();

            for(int i=0; i<num; i++){
                String[] t = br.readLine().split(" ");
                int n1 = Integer.parseInt(t[0]);
                int n2 = Integer.parseInt(t[1]);
                arr.add(new staff(n1,n2));
            }

            //정렬
            Collections.sort(arr, new Comparator<staff>() {
                @Override
                public int compare(staff o1, staff o2) {
                    if(o1.x>o2.x) return 1;
                    else if(o1.x<o2.x) return -1;
                    else return 0;
                }
            });
            int min = arr.get(0).y;
            int ans = 0;
            for(int i=0; i<num; i++){
                if(min>=arr.get(i).y){
                    ans++;
                    min = arr.get(i).y;
                }
            }
            st.append(ans +"\n");
        }
        System.out.print(st);
        br.close();
    }

    private static class staff{
        int x;
        int y;

        public staff(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
