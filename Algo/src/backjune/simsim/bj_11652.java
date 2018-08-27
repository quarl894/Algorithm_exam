package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj_11652 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long,Integer> hash= new HashMap<>();
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<xy> arr = new ArrayList<xy>();
        while(n-->0){
            long num = Long.parseLong(br.readLine());
            if(hash.containsKey(num)){
                hash.put(num,hash.get(num)+1);
            }else{
                hash.put(num,1);
                a.add(num);
            }
        }


        for(int i=0; i<hash.size(); i++){
           arr.add(new xy(a.get(i), hash.get(a.get(i))));
        }

        Collections.sort(arr, new Comparator<xy>() {
            @Override
            public int compare(xy o1, xy o2) {
                if(o1.y >o2.y) return -1;
                else if(o1.y <o2.y) return 1;
                else{
                    if(o1.x>o2.x) return 1;
                    else if(o1.x<o2.x) return -1;
                    else return 0;
                }
            }
        });
        System.out.println(arr.get(0).x);
        br.close();
    }
    private static class xy{
        long x;
        int y;

        public xy(long x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

