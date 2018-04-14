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

				// 지금까지의 단어중에 현재 입력된 단어와 일치하는것이 있나 확인
				for (int k = 0; k < i; k++) {
					if (words[k].equals(words[i])) {
						password = words[i];
					}
				}

				// 정답아니면 현재 단어 거꾸로 저장
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

		// 출력
		StringBuilder sb = new StringBuilder();
		sb.append(password.length());
		sb.append(" ");
		sb.append(password.charAt((password.length() - 1) / 2));

		System.out.println(sb);
	}
}