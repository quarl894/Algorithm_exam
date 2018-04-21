package gg;

public class InsetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	private static void insert(int num[]){
		int size = num.length;
		for(int i=1; i<size; i++){
			int temp = num[i];
			int j=i;
			while(j>0 && num[j-1]>temp){
				num[j] = num[j-1];
				j--;
			}
			num[j] = temp;
		}
	}
}
