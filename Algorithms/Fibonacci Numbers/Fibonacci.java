import java.util.Scanner;

public class Fibonacci {

	 static int calc_fib(int n) {
	    int[] fib= new int[n+1];
	    if(n==0||n==1)
	    	return n;
	    
	    else {
	    	fib[0]=0;
	    	fib[1]=1;
		for(int i=2;i<=n;i++)
			fib[i]=fib[i-1]+fib[i-2];
	    }
		return (fib[n]);
	  }

	  public static void main(String args[]) {
	   Scanner sc= new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.close();

	    System.out.println(calc_fib(n));
	  }

}