package backjune.simsim;

import java.util.HashMap;
import java.util.Scanner;

public class bj_3052 {
    public static void main(String[] args){
        HashMap<Integer, Integer> hash = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            hash.put(sc.nextInt() % 42,0);
        }
        System.out.println(hash.size());
    }
}
