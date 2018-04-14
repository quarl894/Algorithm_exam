package Sort;

public class Binary_test {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		if(binarySearch(arr,8)!=-1) System.out.printf("%d번째에 있다.",binarySearch(arr,8));
		else System.out.println("해당 배열에 없음");
		
	}
	
	static private int binarySearch(int[] arr, int num){
		int left = 0;
		int right = arr.length-1;
		
		while(left<=right){
			int center = (left+right)/2;
			
			if(arr[center]==num){
				return center;
			}else if(arr[center]>num){
				right = center-1;
			}else if(arr[center]<num){
				left = center+1;
			}
		}
		return -1;
	}

}
