package backjune.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_14503_2 {

    public static void main(String[] args) throws Exception{
        solve();
    }
    static int[][] map = new int[50][50];
    static int[] dx = { 0, 1, 0, -1 }; // 북 동 남 서
    static int[] dy = { -1, 0, 1, 0 };
    static boolean[][] visited = new boolean[50][50];
    static Robot start;
    static int m, n, ans;

    private static void solve() {
        Scanner sc= new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        int s = sc.nextInt();
        int e = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        start = new Robot(s, e, d);
        visited[s][e] = true;

        bfs();
        System.out.println(ans + 1);
    }

    public static void bfs() {
        Queue<Robot> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            Robot pos = q.poll();
            int d = pos.d;
            int y = pos.r;
            int x = pos.c;

            int nextDirection = d;
            int nx = 0;
            int ny = 0;
            boolean flag = false;

            // 왼쪽 방향에 청소하지 않은 구역 탐색
            for (int i = 0; i < 4; i++) {
                nextDirection = turnDirection(nextDirection);
                nx = dx[nextDirection] + x;
                ny = dy[nextDirection] + y;
                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (map[ny][nx] == 0 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        ++ans;
                        q.add(new Robot(ny, nx, nextDirection));
                        flag = true;
                        break;
                    }
                }
            }

            // 후진
            if (!flag) {
                nextDirection = backDirection(d);
                nx = dx[nextDirection] + x;
                ny = dy[nextDirection] + y;

                if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if (map[ny][nx] == 0) {
                        q.add(new Robot(ny, nx, d));
                    }
                }
            }

        }
    }

    public static int backDirection(int d) {
        if (d == 0) {
            return 2;
        } else if (d == 1) {
            return 3;
        } else if (d == 2) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int turnDirection(int d) {
        // 0 북, 1 동, 2 남, 3 서
        if (d == 0) {
            return 3;
        } else if (d == 1) {
            return 0;
        } else if (d == 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public static class Robot {
        int r;
        int c;
        int d;

        Robot(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }
}
