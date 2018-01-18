package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//이장님 초대
public class ex_9237 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		br.close();
		//가장 오래 걸리는 나무 순으로 정렬
		Arrays.sort(arr);
		reverse(arr);
		// 심는데 1일씩 걸리므로 심은 날짜 일자를 더해줌.
		for(int i=0; i<N; i++){
			arr[i] = arr[i] + i+1;
		}
		Arrays.sort(arr);
		//가장 오래걸리는것에서 다음날 초대이기때문에 +1
		System.out.println(arr[N-1]+1);
	}
	
	public static void reverse(int[] data) {
	    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	        int temp = data[left];
	        data[left]  = data[right];
	        data[right] = temp;
	    }
	}
}
