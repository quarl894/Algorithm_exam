package backjune.DFS_BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1697 {
    static int f, s, g, u, d;
    static int[] dx = { -1, 1 };
    static boolean[] visited = new boolean[1000001];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        f = Integer.parseInt(sp[0]);
        s = Integer.parseInt(sp[1]);
        g = Integer.parseInt(sp[2]);
        u = Integer.parseInt(sp[3]);
        d = Integer.parseInt(sp[4]);

        dx[0] *= d;
        dx[1] *= u;

        System.out.println(bfs(s));
        br.close();

    }
    public static String bfs(int v) {
        Queue<Node> q = new LinkedList<>();

        q.add(new Node(0, v));
        visited[v] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();
            int cnt = node.count;
            int floor = node.value;

            if (floor == g) {
                return String.valueOf(cnt);
            }

            for (int i = 0; i < 2; i++) {
                int next = dx[i] + floor;

                if (0 < next && next < 1000001) {
                    if (!visited[next]) {
                        q.add(new Node(cnt + 1, next));
                        visited[next] = true;
                    }
                }
            }
        }

        return "use the stairs";
    }

    public static class Node {
        int count;
        int value;

        Node (int count, int value) {
            this.count = count;
            this.value = value;
        }
    }
}


