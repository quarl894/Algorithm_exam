package backjune;

import java.util.Scanner;

public class bj_2810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] str = sc.next().toCharArray();
        int answer = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'L') answer++;
        }
        if(answer==0) System.out.println(N);
        else{
            answer /=2;
            if(answer==1) System.out.println(N);
            else System.out.println(N-answer+1);
        }
        sc.close();
    }
}
