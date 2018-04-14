package Sort;
//선택 알고리즘
public class Selection {
	public static void main(String[] args) {
		int[] arr2 = {6,4,1,8,9,2,7,5,3};
		selectionSort(arr2);
		for(int a : arr2){
			System.out.printf(a+", ");
		}
	}
	private static void selectionSort(int a[]){
		for(int i=0; i<a.length-1; i++){
			int min =i;
			for(int j=i+1; j<a.length; j++){
				if(a[min]>a[j]){
					min =j;
				}
			}
			swap(a, min, i);
		}
	}
	
	private static void swap(int a[], int min, int j){
		int temp = a[min];
		a[min] = a[j];
		a[j]= temp;
	}
}
