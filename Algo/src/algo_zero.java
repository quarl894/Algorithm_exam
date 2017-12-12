//M*N 행렬을 순회하면서 0인 원소를 발견하면, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
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
		System.out.println("0 갯수:"+count+"\n");
		System.out.println("=======변환 결과======");
		setZeros(test);
	}
	
	// 순회하면서 치환하면 행렬 전체가 0이 되기때문에 순회 후 0인 값만 선택하여 바꿔야함.
	public static void setZeros(int[][] matrix){
		int rowNum = matrix.length;
		int colNum = matrix[0].length;
		boolean[] row = new boolean[rowNum];
		boolean[] col = new boolean[colNum];
		
		//0인 원소의 행,열을 찾아서 저장함.
		for(int i=0; i<rowNum; i++){
			for(int j=0; j<colNum; j++){
				if(matrix[i][j]==0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		//0값에 속한 행,열 원소를 0으로 변환함.
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
