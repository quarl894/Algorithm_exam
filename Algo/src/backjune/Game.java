package backjune;

public class Game {
	static int firstMove(int n) {
		int a = greatestFib(n);
		int b = n - a;
		if (b == 0) {
			return 1;
		} else if (2 * b < a) {
			return b;
		} else {
			return firstMove(b);
		}
	}
	static int nextMove(int n, int lastMove, boolean allOK) {
		if (allOK && n <= 2 * lastMove) {
			return n;
		} else {
			int a = greatestFib(n);
			int b = n - a;
			if (b == 0) {
				return 1;
			} else if (2 * b < a && b <= 2 * lastMove) {
				return b;
			} else {
				return nextMove(b, lastMove, false);
			}
		}
	}
	static int greatestFib(int n) {
		return greatestFibHelper(n, 2, 3);
	}
	
	private static int greatestFibHelper(int n, int i, int j) {
		return j > n ? i : greatestFibHelper(n, j, i + j);
	}

}