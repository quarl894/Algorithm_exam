package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

//�мǿ� ���غ�
public class ex_9375 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String,Integer> hash = new HashMap<>();
		StringBuilder st =new StringBuilder();
		for(int i=0; i<N; i++){
			int num = Integer.parseInt(br.readLine());
			hash = new HashMap<>();
			for(int j=0; j<num; j++){
				String[] sp = br.readLine().split(" ");
				//�ǻ������� �ִٸ� ���� +1
				if(hash.containsKey(sp[1])){
					hash.replace(sp[1], hash.get(sp[1])+1);
				}else{
					hash.put(sp[1],1);
				}
			}
			//0�� ������ �ȵǱ⶧���� 1�� �ʱ�ȭ
			int result = 1;
			// value : ī�װ��� ���� //   (�Ѱ��� ����+���Դ°��) = value+1 �� �����ָ� ����� ��
			for(int value : hash.values()){
				result *=(value+1);
			}
			// -1�� �˸��ϰ�� ����
			st.append(result-1);
			st.append("\n");
		}
		System.out.println(st);
		br.close();
		
	}
}
