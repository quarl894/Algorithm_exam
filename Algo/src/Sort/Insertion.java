package Sort;
//��������
public class Insertion {
	public static void main(String[] args) {
		  int[] arr2 = {6,4,1,8,9,2,7,5,3};
		  insertionSort(arr2);
		  for(int a : arr2){
			  System.out.printf(a+" ");
		  }
	}
	private static int[] insertionSort(int a[]){
		if(a==null) return null;
		int temp;
		for(int i=1; i<a.length; i++){
			temp = a[i];
			int k;
			for(k=i-1; k>=0; k--){
				if(temp>=a[k]){
					break;
				}
				//��ĭ �� �о��
				a[k+1]= a[k];
			}
			//�ش� �� ����ֱ�
			a[k+1]= temp;
		}
		return a;
	}
}
