// �̹����� ǥ���ϴ� N*N ����� �ִ�. �̹����� �� �ȼ��� 4����Ʈ�� ǥ���ȴ�.
// �� ��, �̹����� 90�� ȸ����Ű�� �޼��带 �ۼ��϶�. �ΰ����� ����� ������� �ʰ��� �� �� �ִ°�?

public class algo_img {
	public static void main(String[] args) {
		int a[][]= new int[4][4];
		int count = 1;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				a[i][j] = count;
				System.out.printf("%d ", a[i][j]);
				count++;
			}
			System.out.println();
		}
		System.out.println();
		rotate(a);
	}
	
	public static void rotate(int a[][]){
		int result[][] = a;
		int col= result.length-1;
		int row = result[0].length-1;
		
		System.out.printf("%d %d �̴�\n", col,row);
		for(int i=0; i<=col; i++){
			for(int j=0; j<=row; j++){
				int temp = result[i][j];
				result[i][j] = result[row-j][i];
				result[row-j][i] = temp;
			}
		}
		
		for(int num= 0; num<=col; num++){
			for(int num2 =0; num2<=row; num2++){
				System.out.printf("%d ",result[num][num2]);
			}
			System.out.println();
		}
	}

}
