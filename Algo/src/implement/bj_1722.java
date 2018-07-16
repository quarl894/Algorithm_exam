package implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_1722 {
    static long count = 0;
    static long f ;
    static long[] sunyul2;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        long[] sunyul = new long[N];
        for(int i=0; i<N; i++){
            sunyul[i] = i+1;
        }
        int num = Integer.parseInt(arr[0]);
        f = Long.parseLong(arr[1]);
        sunyul2 = new long[N];
        if(num==1) perm(sunyul, num);
        else{
            for(int i=1; i<arr.length; i++){
                sunyul2[i-1] = Long.parseLong(arr[i]);
            }
          //  System.out.println(sunyul.length + ", " + sunyul2.length);
            perm(sunyul, num);
        }

        br.close();

    }

    private static void perm(long[] arr, int chk){
        count++;
        System.out.println(count);
        if(count == f && chk ==1){
            print(arr);
            return;
        }else if(chk==2){
            int ok = 0;
            for(int k=0; k<arr.length; k++){
                if(arr[k] == sunyul2[k]) ok++;
            }
            if(ok == arr.length){
                System.out.println(count);
                return;
            }
        }
        int i = arr.length -1;
        while(i>0 && arr[i-1]>=arr[i]){ //가장 긴 감소수열 찾기.
            i -=1;
        }

        int j = arr.length - 1;

        while(j>=i && arr[i-1]>=arr[j]){
            j -=1;
        }
        swap(arr,i-1,j);

        j = arr.length -1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        perm(arr, chk);
    }

    private static void swap(long[] arr, int i, int j){
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(long[] arr){
        StringBuilder st = new StringBuilder();
        for(int i=0; i<arr.length-1; i++){
            st.append(arr[i] + " ");
        }
        st.append(arr[arr.length-1]);
        System.out.println(st);
    }
}
