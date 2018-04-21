package backjune;
import java.util.Scanner;

public class ex_4383_2{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
           int n = sc.nextInt();
           int[] arr = new int[n];
           boolean[] sub = new boolean[n];
           for (int i=0; i<n; i++) {
              arr[i] = sc.nextInt();
           }
           
           boolean isJolly = true; 
           for (int i=0; i<n-1; i++) {
              int abs = Math.abs(arr[i]-arr[i+1]);
              if (abs >= n || sub[abs]) {
                 isJolly = false;
                 break;
              }
              sub[abs] = true;
           }
           System.out.println(isJolly?"Jolly":"Not jolly");
        }
    }
}