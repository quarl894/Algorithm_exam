package implement;

import java.util.Scanner;

public class bj_1094 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 64;
        int count =1;
        while(N!=x){
            if(x/2 <N){
                N -= (x/2);
                x /=2;
                count++;
            }else{
                x /=2;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
