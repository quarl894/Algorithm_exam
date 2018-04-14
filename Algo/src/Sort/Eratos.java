package Sort;

public class Eratos {
	 public int n;
	 public final static int MAX_N=100;
	 public char[] sieve=new char[(MAX_N+7)/8];
	 
	 Eratos(int n){
	  this.n=n;
	 }
	 public boolean isPrime(int k){
	               //k>>3은 k를 8로 나눈것 과 같다.(비트 이동 연산자 사용)
	               //k&7은 k를 8로 나눈 나머지와 같고, 1을 8로 나눈 나머지 만                //큼 왼쪽으로 이동한 위치가 찾고자 하는 k의 위치이다.
	  if((sieve[k>>3] & (1<<(k&7))) >0)
	   return true;
	  else
	   return false;
	 }
	// 소수가 아닌 합성수 일 경우 ~연산과 &연산을 통해 0으로 바꾼다.
	 void setComposition(int k){
	  sieve[k>>3] &= ~(1<<(k&7));
	 }
	 void eratos(){
	  for(int i=0;i<sieve.length;i++)
	   sieve[i]=255;
	  setComposition(0);
	  setComposition(1);
	  int numSize=n;
	  //여기서 i<n의 제곱근 만큼만 반복해도 된다.
	         //합성수 p*q에서 p나 q중 하나는 n의 제곱근보다 작을 수 밖에 없다.
	         //2부터 시작하여 배열에 남아있는 수의 배수를 전부 지운다.
	         //이런 원리로 시작하면 2는 별다른 설정 없이 소수로 간주한다.
	  for(int i=2;i<=numSize;i++)
	   if(isPrime(i))
	    for(int j=i*i; j<=n; j+=i)
	     setComposition(j);
	  
	 }
	 
	 public static void main(String[] args){
	  Eratos sample=new Eratos(100);
	  sample.eratos();
	  for(int i=0; i<100; i++){
	   System.out.print(i+"="+sample.isPrime(i)+" ");
	   if(i%10==0)
	    System.out.println();
	   
	  }
	 }
}