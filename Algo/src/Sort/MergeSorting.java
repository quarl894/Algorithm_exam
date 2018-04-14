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
		//���� �迭 ����
		for(int i=0; i<middle; i++){
			leftNum[i] = num[i];
		}
		//������ �迭 ����
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
		
		//����, ������ �迭 ��ġ��
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
		
		//�������� ���� ������ ���
		while(leftNum.length !=left){
			num[merge] = leftNum[left];
			left++;
			merge++;
		}
		//������ ���� ������ ���
		while(RightNum.length !=right){
			num[merge] = RightNum[right];
			right++;
			merge++;
		}
	}
}
