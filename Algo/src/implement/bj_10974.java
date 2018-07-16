package implement;

import java.util.Scanner;

public class bj_10974 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        print(arr);
        back_perm(arr);
        sc.close();

    }

    private static void back_perm(int[] arr){
        int i= arr.length -1;
        while(i>0 && arr[i-1]>=arr[i]){
            i -=1;
        }

        if(i<=0){
            return;
        }

        int j = arr.length -1;
        while(arr[j]<=arr[i-1]){
            j -=1;
        }
        swap(arr,i-1, j);

        j = arr.length -1; //초기화 시켜줘야 함.
        while(i<j){
            swap(arr,i,j);
            i += 1;
            j -= 1;
        }
        print(arr);
        back_perm(arr);

    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr){
        StringBuilder st = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1) st.append(arr[i]);
            else st.append(arr[i] + " ");
        }
        System.out.println(st);
    }
}
