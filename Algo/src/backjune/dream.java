package backjune;

//Problem   Mondriaan's Dream
//Algorithm Dynamic Programming, Backtracking
//Runtime   O(r * (sqrt(2)+1)^c)
//Author    Walter Guttmann
//Date      14.12.1999
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class dream{
static BigInteger cnt[][] = new BigInteger[12][1<<11];
static int trans[][] = new int[16384][2];
static int rows, cols, ntrans;

static void backtrack (int n, int from, int to)
{
 if (n > cols) return;
 if (n == cols)
 {
   trans[ntrans][0] = from;
   trans[ntrans][1] = to;
   ++ntrans;
   return;
 }
 backtrack (n+2, from<<2, to<<2);
 backtrack (n+1, from<<1, (to<<1)|1);
 backtrack (n+1, (from<<1)|1, to<<1);
}

public static void main (String[] arg) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 while (true)
 {
	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
   rows = Integer.parseInt(st.nextToken());
   cols = Integer.parseInt(st.nextToken());
   
   if (rows == 0 || cols == 0) break;
   if (rows < cols) { int t = rows; rows = cols ; cols = t; }
   if (rows % 2 == 1 && cols % 2 == 1) { System.out.println (0); continue; }

   ntrans = 0;
   backtrack (0, 0, 0);

   for (int r=0 ; r<=rows ; r++)
     for (int q=0 ; q<(1<<cols) ; q++)
       cnt[r][q] = new BigInteger ("0");
   cnt[0][0] = new BigInteger ("1");

   for (int r=0 ; r<rows ; r++)
     for (int t=0 ; t<ntrans ; t++)
       cnt[r+1][trans[t][1]] =
         cnt[r+1][trans[t][1]].add(cnt[r][trans[t][0]]);

   System.out.println (cnt[rows][0]);
 }
}
}
