package Sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr2 = {6,4,1,8,9,2,7,5,3};
		sort(arr2, 0, arr2.length-1); 

	}
	public static void sort(int num[], int start, int end) {
	    if (start >= end) return;

	    int left = start;
	    int right = end;
	    int pivot = num[(left + end) / 2];

	    do {
	        while (num[left] < pivot) left++;
	        while (num[right] > pivot) right--;
	        System.out.println("pivot : "+pivot +" left: "+ left +" right:" +right);
	       
	        if (left <= right) {
	            int temp = num[left];
	            num[left] = num[right];
	            num[right] = temp;
	            System.out.println(Arrays.toString(num));
	            left++;
	            right--;
	        }
	    } while (left <= right);
	    System.out.println("ºüÁ®³ª¿È");
	    if (start < right) sort(num, start, right);
	    if (end > left) sort(num, left, end);
	}
}
