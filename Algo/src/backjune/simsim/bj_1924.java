package backjune.simsim;

import java.util.Scanner;

public class bj_1924 {
    public static void main(String[] args){
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()-1;
        int b = sc.nextInt();
        int sum = b;

        for(int i=0; i<a; i++){
            sum += month[i];
        }
        sum %=7;
        switch(sum){
            case 1 : System.out.println("MON");
            break;
            case 2 : System.out.println("TUE");
                break;
            case 3 : System.out.println("WED");
            break;
            case 4 : System.out.println("THU");
            break;
            case 5 : System.out.println("FRI");
            break;
            case 6 : System.out.println("SAT");
            break;
            case 0 : System.out.println("SUN");
            break;
        }
        sc.close();
    }
}
