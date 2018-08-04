package backjune.simsim;

import java.util.Scanner;

public class bj_2490 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int num =0;
            for(int j=0; j<4; j++){
                if(sc.nextInt()==0) num++;
            }
            result(num);
        }
        sc.close();
    }

    private static void result(int n){
        switch (n){
            case 0 : System.out.println("E");
            break;
            case 1 : System.out.println("A");
            break;
            case 2 : System.out.println("B");
            break;
            case 3 : System.out.println("C");
            break;
            case 4 : System.out.println("D");
            break;
        }
    }
}
