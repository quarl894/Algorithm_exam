package backjune.simsim;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.math.BigInteger;
        import java.util.Scanner;
        import java.util.StringTokenizer;

public class bj_10950 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        BigInteger a = BigInteger.valueOf(sc.nextLong());
        BigInteger b = BigInteger.valueOf(sc.nextLong());

        System.out.println(a.add(b));
        sc.close();
    }
}
