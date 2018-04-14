package Sort;

public class Combination { 
	public static void main(String[] args) { 
		int[] arr = new int[5]; 
		combination(arr, 0, 5, 5, 0); 
		} 
	public static void combination(int[] arr, int index, int n, int r, int target) {
		if (r == 0) print(arr, index);
		else if (target == n) return;
		else { arr[index] = target; combination(arr, index + 1, n, r - 1, target + 1); 
		combination(arr, index, n, r, target + 1); 
		}
	}//end 
	public static void print(int[] arr, int length) {
		for (int i = 0; i < length; i++) 
			System.out.print(arr[i]); 
		System.out.println(""); 
		} 
}

