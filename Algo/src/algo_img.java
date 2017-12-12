// 이미지를 표현하는 N*N 행렬이 있다. 이미지의 각 픽셀은 4바이트로 표현된다.
// 이 때, 이미지를 90도 회전시키는 메서드를 작성하라. 부가적인 행렬을 사용하지 않고서도 할 수 있는가?

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
		
		System.out.printf("%d %d 이다\n", col,row);
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
