package backjune.simsim;

import java.util.Scanner;

public class bj_3943 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            int num =sc.nextInt();
            int max = num;

            while(num!=1){
                if(num%2==0) num /=2;
                else num = num*3 +1;
                max = Math.max(max,num);
            }
            st.append(max +"\n");
        }
        System.out.println(st);
        sc.close();
    }
}
