package backjune.simsim;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2997 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int m1 = a[1]-a[0];
        int m2 = a[2]-a[1];
        int num = Math.min(m1,m2);
        int ans = 0;

        if(m1==m2){
            if(a[2]+num>100) ans = a[0] -num;
            else ans = a[2]+num;
        }else if(m1>m2){
            ans = a[1] -num;
        }else{
            ans = a[1]+num;
        }
        System.out.println(ans);
    }

}
