package backjune.simsim;

import java.util.ArrayList;
import java.util.Scanner;

public class bj_1929 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] c = new boolean[1000001];
        ArrayList<Integer> arr = new ArrayList<>();
        //소수 구하기
        for(int i=2;i<=n; i++) {
            if(!c[i]){
                if(i>=m) arr.add(i);
                for(int j=2*i; j<=n; j+=i){
                    c[j] = true;
                }
            }
        }
        StringBuilder st = new StringBuilder();
        for(int a : arr) st.append(a+"\n");
        System.out.print(st);
        sc.close();
    }
}
