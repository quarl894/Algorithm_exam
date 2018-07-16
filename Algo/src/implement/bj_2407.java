package implement;

import java.math.BigInteger;
import java.util.Scanner;

public class bj_2407 {
    static BigInteger[][] big;
    public static void main(String[] args){
        big = new BigInteger[1001][1001];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();

        big[1][0] = big[1][1] = BigInteger.ONE;

        for(int i=2; i<=N; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0) big[i][j] = BigInteger.ONE;
                else big[i][j] = big[i-1][j-1].add(big[i-1][j]);
            }
        }
        System.out.println(big[N][R]);
        sc.close();
    }
}