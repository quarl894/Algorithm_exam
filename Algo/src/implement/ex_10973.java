package implement;

import java.util.Scanner;

public class ex_10973 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        if(back_perm(arr)) print(arr);
        else System.out.println(-1);
        sc.close();

    }

    private static boolean back_perm(int[] arr){
        int i = arr.length -1;

        while(i>0 && arr[i-1]<=arr[i]){
            i -=1;
        }
        if(i<=0) return false;

        int j = arr.length-1;
        while(arr[i-1] <=arr[j]){
            j -=1;
        }
        swap(arr,i-1,j);

        j = arr.length -1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        print(arr);
        return true;


    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1) System.out.println(arr[i]);
            else System.out.printf(arr[i] + " ");
        }
    }
}
