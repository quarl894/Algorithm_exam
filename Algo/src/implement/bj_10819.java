package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_10819 {
    static int max = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] a = new int[N];
        for(int i=0; i<N; i++) a[i] = Integer.parseInt(arr[i]);
        Arrays.sort(a);

        perm(a);
        System.out.println(max);

        br.close();
    }

    private static void perm(int[] arr){
        int i = arr.length -1;

        // 중복값 허용이면 arr[i-1] >= arr[i] 등호표시해주면 됨.
        while(i>0 && arr[i-1] >=arr[i]){
            i -=1;
        }
        if(i<=0) return;

        int j = arr.length -1;

        while(arr[j]<=arr[i-1]){
            j -=1;
        }
        swap(arr, i-1, j);

        j = arr.length -1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        if(max< result(arr)) max = result(arr);

        perm(arr);
    }

    private  static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int result(int[] arr){
        int result = 0;
        for(int i=1; i<arr.length; i++){
            result +=Math.abs(arr[i-1] - arr[i]);
        }
        return result;
    }
}

