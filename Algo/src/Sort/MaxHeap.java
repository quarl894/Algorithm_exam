package Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxHeap {
	static int count =0;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		br.close();
		for(int i=0; i<N; i++){
			arr[i] = i+1;
		}
		heapSort(arr);
		printArray(arr);
		System.out.println(count);
	}
	private static void heapSort(int[] arr) {
		int length = arr.length - 1;
		maxHeapBuild(arr);
		for (int i = length; i >= 1; i--) {
			swap(arr, 0, i);
			length-=1;
			maxHeapify(arr, 0);
		}
	}
	private static void maxHeapBuild(int[] arr) {
		int length = arr.length;
		// ������ ����� �θ� ��忡������ ����
		for (int i = length / 2; i >= 0; i--) {
			maxHeapify(arr, i);
		}
	}
	private static void maxHeapify(int[] arr, int i) {
		int length = arr.length;
		int leftChild = i*2;
		int rightChild = (i*2)+1;
		int k = 0;
		//�ڽ� ��尡 ���� ��쿡�� �����Ѵ�.
		if(leftChild > length || rightChild > length) {
			return;
		}
		//�� ū Child�� k�� �Ҵ��Ѵ�.
		if (arr[leftChild] > arr[rightChild]) {
			k = leftChild;
		} else {
			k = rightChild;
		}
		//�θ� ��尡 �ڽĺ��� ū ��� ��
		if (arr[i] >= arr[k]) {
			return;
		}
		//swap
		swap(arr, i, k);
		count++;
		maxHeapify(arr, k);
	}
	public static void printArray(int arr[]) {
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			st.append(arr[i]);
			st.append(" ");
//			System.out.print(arr[i] + " ");
		}
		System.out.println(st);
	}
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
