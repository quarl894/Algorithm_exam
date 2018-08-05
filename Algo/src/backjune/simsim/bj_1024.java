package backjune.simsim;

import java.util.Scanner;

public class bj_1024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        boolean flag = false;

        int sum = 0;
//        long l = n/m - m +1;
//        if(l<1) l = 1;
        long r = n;
        long l = r-m+1;
        if(l<1) l = 1;

        for(long i=l; i<=r; i++){
            sum+=i;
        }

        while(l<=r && sum!=n){
            if((r==1  || l==1) && sum!=n){
                flag = true;
                break;
            }
            if(r-l>100){
                flag = true;
                break;
            }
            if(sum<n){
                --l;
                if(l<1){
                    l=1;
                    continue;
                }
                sum+=l;
            }else if(sum==n && r-l>=m) break;
            else{
                sum -=r;
                --r;
                if(r<1){
                    flag = true;
                    break;
                }
            }
        }
        StringBuilder st= new StringBuilder();
        if(flag || n<m) System.out.println(-1);
        else{
            for(long i=l; i<=r; i++){
                st.append(i+ " ");
            }
            System.out.println(st);
        }
        sc.close();
    }
}
