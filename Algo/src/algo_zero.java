//M*N ����� ��ȸ�ϸ鼭 0�� ���Ҹ� �߰��ϸ�, �ش� ���Ұ� ���� ��� ���� ��� ���Ҹ� 0���� �����ϴ� �˰����� �ۼ��϶�.
public class algo_zero {

	public static void main(String[] args) {
		int test[][]= new int[10][10];
		int count =0;
		for(int i=0; i<test.length; i++){
			for(int j=0; j<test[0].length; j++){
				int num= (int) (Math.random()*10 );
				test[i][j]= num;
				if(num==0){
					count++;
				}
				System.out.printf("%d ", num);
			}
			System.out.println();
		}
		System.out.println("0 ����:"+count+"\n");
		System.out.println("=======��ȯ ���======");
		setZeros(test);
	}
	
	// ��ȸ�ϸ鼭 ġȯ�ϸ� ��� ��ü�� 0�� �Ǳ⶧���� ��ȸ �� 0�� ���� �����Ͽ� �ٲ����.
	public static void setZeros(int[][] matrix){
		int rowNum = matrix.length;
		int colNum = matrix[0].length;
		boolean[] row = new boolean[rowNum];
		boolean[] col = new boolean[colNum];
		
		//0�� ������ ��,���� ã�Ƽ� ������.
		for(int i=0; i<rowNum; i++){
			for(int j=0; j<colNum; j++){
				if(matrix[i][j]==0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		//0���� ���� ��,�� ���Ҹ� 0���� ��ȯ��.
		for(int i=0; i<rowNum; i++){
			for(int j=0; j<colNum; j++){
				if(row[i]==true || col[j]==true){
					matrix[i][j] =0;
				}
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
