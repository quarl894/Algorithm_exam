package backjune;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class tt {
	static int[][] tomatoes;
	static int W, H;
	static Queue<TomatoPosition> queue;
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		tomatoes = new int[H][W];
		queue = new LinkedList<TomatoPosition>();
		count = 0;
		
		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				tomatoes[i][j] = Integer.parseInt(st.nextToken());
				if (tomatoes[i][j] == 1) {
					queue.offer(new TomatoPosition(i, j, 0));
				}
			}
		}
		// 입력받기 끝

		// bfs
		bfs();
		
		// 다 익었나 확인
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (tomatoes[i][j] == 0) {
					count = -1;
					break;
				}
			}
		}
		if (count == -1) {
			System.out.println(-1);
		}else{
			System.out.println(count);
		}
		br.close();
	}

	private static void bfs() {
		while (!queue.isEmpty()) {

			TomatoPosition tomato = queue.poll();
			tomatoes[tomato.x][tomato.y] = 1;

			int[] xArr = { -1, 0, 1, 0 };
			int[] yArr = { 0, 1, 0, -1 };
			int thisDate = tomato.date;

			for (int i = 0; i < 4; i++) {
				int moveX = tomato.x + xArr[i];
				int moveY = tomato.y + yArr[i];
				if ((moveX >= 0 && moveX < H) && moveY >=0 && moveY <W) {
					queue.offer(new TomatoPosition(moveX, moveY, thisDate+1));
				}
			}
			count = thisDate;
		}
	}

	static private class TomatoPosition {
		int x;
		int y;
		int date;

		public TomatoPosition(int x, int y, int date) {
			this.x = x;
			this.y = y;
			this.date = date;
		}
	}
}
