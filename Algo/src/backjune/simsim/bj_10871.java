package backjune.simsim;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_10871 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;

        System.out.println(sum- Math.max(a,Math.max(b,c)) - Math.min(a,Math.min(b,c)));

        sc.close();
    }
}
