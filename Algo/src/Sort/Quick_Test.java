package Sort;

public class Quick_Test {

	public static void main(String[] args) {
		int[] arr = {6,4,1,8,9,2,7,5,3};
		Quick(arr,0,arr.length-1);
		for(int a : arr) System.out.printf(a + " ");
	}
	
	public static void Quick(int[] arr, int start, int end){
		int left = start;
		int right = end;
		int pivot = arr[(left+right)/2];
		
		do{
			while(arr[left]<pivot) left++;
			while(arr[right]>pivot) right--;
			
			if(left<=right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}while(left<=right);
		
		if(start<right) Quick(arr, start, right);
		if(end>left) Quick(arr,left,end);
	}

}
