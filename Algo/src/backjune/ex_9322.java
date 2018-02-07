package backjune;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ex_9322 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder st = new StringBuilder();
		int[] order = null;
		for(int i=0; i<N; i++){
			//word_num : �ܾ� �� text : ��1 ����Ű /  ciphertext : ��2����Ű / ciphertext2 : ��ȣ��
			int word_num= Integer.parseInt(br.readLine());
			String[] text = br.readLine().split(" ");
			String[] ciphertext = br.readLine().split(" ");
			String[] ciphertext2 = br.readLine().split(" ");
			
			//order : ��1 ����Ű���� ��2����Ű�� �ٲٴ� ������ ������ ���� Ȯ���ϴ� �迭
			order = new int[word_num];
			String[] result = new String[word_num];
			HashMap<String,Integer> hash = new HashMap<>();
			for(int j=0; j<word_num; j++){
				hash.put(text[j], j);
			}
			for(int j=0; j<word_num; j++){
				//���� ã��
				order[j] = hash.get(ciphertext[j]);
				// ������� ��ȣ���� ������ �ٲ�
				result[order[j]] = ciphertext2[j];
			}
			//����ϱ� ���� StringBuilder�� ����ִ� ����
			for(int j=0; j<word_num; j++){
				st.append(result[j]);
				st.append(" ");
			}
			st.append("\n");
		}
		System.out.println(st);
		br.close();
	}
}
