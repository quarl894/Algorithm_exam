package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//나무 조각
public class ex_2947 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[5];
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<5; i++){
			arr[i]= Integer.parseInt(stk.nextToken());
		}
	
		for(int i=0; i<5; i++){
			for(int j=0; j<4; j++){
				if(arr[j]>arr[j+1]) swap(arr,j,j+1);
			}
		}
		br.close();
	}
	
	static private void swap(int[] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		for(int num : arr) System.out.printf(num + " ");
		System.out.println();
	}

}
