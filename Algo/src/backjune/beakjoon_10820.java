package backjune;

import java.util.Arrays;
import java.util.Scanner;

public class beakjoon_10820 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String str = sc.nextLine();
            int[] arr= new int[4];
            Arrays.fill(arr,0);

            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)>=97 && str.charAt(i)<=122) arr[0]++;
                else if(str.charAt(i)>=65 && str.charAt(i)<=90) arr[1]++;
                else if(str.charAt(i)>=48 && str.charAt(i)<=57) arr[2]++;
                else if(str.charAt(i)==32) arr[3]++;
            }
            System.out.println(arr[0] + " " +arr[1] + " "+ arr[2] + " "+arr[3]);
        }
        sc.close();
    }
}
