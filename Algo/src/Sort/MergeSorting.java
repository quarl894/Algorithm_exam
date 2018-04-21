package Sort;
import java.util.Arrays;

public class MergeSorting {
	public static void main (String args[]){
		int[] arr2 = {6,4,1,8,9,2,7,5,3};
		mergeSort(arr2,arr2.length);
		for(int a : arr2){
			System.out.printf(a+" ");
		}
	}
	
	private static void mergeSort(int num[], int length){
		int middle = length/2;
		int leftNum[] = new int[middle];
		int RightNum[] = new int[length-middle];
		
		if(length==1) return;
		//왼쪽 배열 생성
		for(int i=0; i<middle; i++){
			leftNum[i] = num[i];
		}
		//오른쪽 배열 생성
		for(int i=0; i<length-middle; i++){
			RightNum[i] = num[middle+i];
		}
		
		mergeSort(leftNum,leftNum.length);
		mergeSort(RightNum, RightNum.length);
		merge(leftNum, RightNum, num);
	}
	
	private static void merge(int[] leftNum, int[] RightNum, int[] num){
		int left =0;
		int right =0;
		int merge =0;
		
		//왼쪽, 오른쪽 배열 합치기
		while(leftNum.length !=left && RightNum.length !=right){
			if(leftNum[left]<RightNum[right]){
				num[merge] = leftNum[left];
				left++;
				merge++;
			}else{
				num[merge] = RightNum[right];
				right++;
				merge++;
			}
		}
		
		//오른쪽이 먼저 끝났을 경우
		while(leftNum.length !=left){
			num[merge] = leftNum[left];
			left++;
			merge++;
		}
		//왼쪽이 먼저 끝났을 경우
		while(RightNum.length !=right){
			num[merge] = RightNum[right];
			right++;
			merge++;
		}
	}
}
