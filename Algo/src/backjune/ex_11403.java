package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���ã��
public class ex_11403 {
    static int nE; //���� ����
    static int nV; //Vertex ����
    static int[][] ad;   //�������
    static boolean[] visit; //�湮 Ȯ��

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		nV = N;
		nE = N;
		ad = new int[nV][nV]; // ���� �ʱ�ȭ
	    visit = new boolean[nV]; // ���� �ʱ�ȭ
	    int inf =100; //������ �ִ� 100���̹Ƿ� 100�� �� �� ���� ��.
		//���� �׷���
		for(int i=0; i<N; i++){
			String[] sp = br.readLine().split(" ");
			for(int j=0; j<N; j++){
				ad[i][j] = Integer.parseInt(sp[j]);
				// ���� ���� ���� inf�� �ʱ�ȭ ����.
				if(ad[i][j]==0) ad[i][j] = inf;
			}
		}
		//�÷��̵� �˰���
		for(int k=0; k<N; k++){
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					//���ڰ� �ƴ� �߰� ��θ� ���� ����Ǵ� ��
					if(ad[i][j]>ad[i][k]+ad[k][j]){
						ad[i][j] = ad[i][k] +ad[k][j];
					}
				}
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				//inf���̸� �������� ���ٴ� ��
				System.out.printf("%d ",ad[i][j] == inf ? 0 :1);
			}
			System.out.println();
		}
		br.close();
	}
}
