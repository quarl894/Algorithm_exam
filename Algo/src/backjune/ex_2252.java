package backjune;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex_2252{

	static int N; // ������ ��
	static int M; // ������ ����
	static HashMap<Integer, LinkedList<Integer>> maps = new HashMap<>();
	static int[] in;

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().trim().split(" ");
		N = Integer.parseInt(sp[0]);
		M = Integer.parseInt(sp[1]);
		in = new int[N + 1];

		for (int i = 0; i < M; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(stk.nextToken());
			int to = Integer.parseInt(stk.nextToken());

			if (!maps.containsKey(from)) {
				LinkedList<Integer> list = new LinkedList<>();
				maps.put(from, list);
			}

			// ����� ������¸� ��ũ�� ����Ʈ�� ǥ�� 
			maps.get(from).add(to);
			// �Է����� ������ ������ ���¸� ��� 
			in[to]++;
		}
		br.close();

		Queue<Integer> queue = new LinkedList<>();

		// �ʱ� �������� ��� 
		for (int i = 1; i < N + 1; i++) {
			if (in[i] == 0)
				queue.offer(i);
		}

		while (true) {
			if (queue.size() == 0)
				break;

			int from = queue.poll();

			System.out.print(from + " ");

			// ��尡 ������ ������ ������ ť�� �߰� 
			if (maps.containsKey(from)) {
				for (int to : maps.get(from)) {

					if (--in[to] == 0)
						queue.add(to);

				}
			}
		}

	}
}
