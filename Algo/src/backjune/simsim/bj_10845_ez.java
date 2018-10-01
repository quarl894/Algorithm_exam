package backjune.simsim;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class bj_10845_ez {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = "";
            int last = 0;	    // 가장 뒤에 있는 정수 저장 (push 된 것이 가장 마지막)

            int n = sc.nextInt();		// 명령 개수

            Queue<Integer> q = new LinkedList<>();

            for (int i=0; i<n; i++) {
                str = sc.next();

                switch (str) {
                    case "push" :
                        int x = sc.nextInt();
                        last = x;
                        q.offer(x);
                        break;

                    case "pop":
                        if (q.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(q.poll());
                        }
                        break;

                    case "size":
                        System.out.println(q.size());
                        break;

                    case "empty":
                        if (q.isEmpty()) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                        break;

                    case "front" :
                        if (q.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(q.peek());
                        }
                        break;

                    case "back":
                        if (q.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(last);
                        }
                        break;
                }
            }
        }
}

