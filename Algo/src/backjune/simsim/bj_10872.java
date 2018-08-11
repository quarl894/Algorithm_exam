package backjune.simsim;

import java.util.Scanner;

public class bj_10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(1);
            return;
        }
        long num = n;
        while(n-->1){
            num *=n;
        }
        System.out.println(num);

        sc.close();
    }

}
