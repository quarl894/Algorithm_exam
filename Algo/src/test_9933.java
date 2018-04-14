import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_9933{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		String[] words = new String[101];

		String password = "";
		if (N == 1) {
			password = br.readLine();
		} else {
			for (int i = 0; i < N; i++) {
				words[i] = br.readLine();

				// ���ݱ����� �ܾ��߿� ���� �Էµ� �ܾ�� ��ġ�ϴ°��� �ֳ� Ȯ��
				for (int k = 0; k < i; k++) {
					if (words[k].equals(words[i])) {
						password = words[i];
					}
				}

				// ����ƴϸ� ���� �ܾ� �Ųٷ� ����
				if (password.equals("")) {
					int j = words[i].length() - 1;
					String temp = "";
					while (j >= 0) {
						temp += words[i].charAt(j);
						j--;
					}

					words[i] = temp;
				} else {
					break;
				}
			}
		}
		br.close();

		// ���
		StringBuilder sb = new StringBuilder();
		sb.append(password.length());
		sb.append(" ");
		sb.append(password.charAt((password.length() - 1) / 2));

		System.out.println(sb);
	}
}