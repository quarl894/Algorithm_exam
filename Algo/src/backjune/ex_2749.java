package backjune;

import java.util.Scanner;
/*
    �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
    �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
    n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
    n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
    n�� 1,000,000,000,000,000,000���� �۰ų� ���� �ڿ����̴�.
    ù° �ٿ� n��° �Ǻ���ġ ���� 1,000,000���� ���� �������� ����Ѵ�.
*/
// �ǻ�� �ֱ⸦ �̿��� �Ǻ���ġ
// �ǻ�� �ֱ�� �Ǻ���ġ ���� K�� ���� �������� �׻� �ֱ⸦ ���� �ȴٴ� ���̴�
// �Ǻ���ġ ���� 3���� �������� ��, �ֱ��� ���̴� 8�̴�
public class ex_2749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        int M = 1000000;    // ������
        //int K = 6;          // 10^6 �̹Ƿ� K�� 6
        //int P = 15 * (int) Math.pow(10, K - 1); // �ֱ�� 15 * 10^(k-1)
        int P = 15 * M / 10;// M/10 �� M^(k-1) �� ����

        long[] D = new long[P + 1];
        fibonacci(D, P, M);
        System.out.println(D[(int) (N % P)] % M); // D[N] % M = D[N % P] % M
    }

    // �ֱ�� 1500000 - recursive�� stack overflow
    static long fibonacci(long[] D, int n, int m) {
        D[0] = 0;
        D[1] = 1;
        for (int i = 2; i <= n; i++) {
            D[i] = D[i - 1] + D[i - 2];
            D[i] %= m;
        }
        return D[n];
    }
}