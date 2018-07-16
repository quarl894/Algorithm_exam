package implement;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr= new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        perm(arr,0, arr.length, arr.length);

    }

    public static void perm(int[] arr, int depth, int n, int k){
        if(depth == k){
            print(arr, k);
            return;
        }
        for(int i=depth; i<n; i++){
            swap(arr,i,depth);
            perm(arr, depth+1, n, k);
            swap(arr,i,depth);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr, int k){
        for(int i=0; i<k; i++){
            if(i==k-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i] + " ");
            }
        }
    }

}
