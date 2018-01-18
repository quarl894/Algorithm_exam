package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//����� �ʴ�
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
		//���� ���� �ɸ��� ���� ������ ����
		Arrays.sort(arr);
		reverse(arr);
		// �ɴµ� 1�Ͼ� �ɸ��Ƿ� ���� ��¥ ���ڸ� ������.
		for(int i=0; i<N; i++){
			arr[i] = arr[i] + i+1;
		}
		Arrays.sort(arr);
		//���� �����ɸ��°Ϳ��� ������ �ʴ��̱⶧���� +1
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
