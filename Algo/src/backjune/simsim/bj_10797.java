package backjune.simsim;

import java.util.Scanner;

public class bj_10797 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        int num = 5;
        while(num-->0){
            if(n==sc.nextInt()) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
