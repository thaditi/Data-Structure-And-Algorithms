import java.util.Scanner;

public class FibonacciSumLastDigit {
	
	static int fib(long n) 
	{ 
	      
	    // The first two Fibonacci numbers 
	    int f0 = 0; 
	    int f1 = 1; 
	  
	    // Base case 
	    if (n == 0) 
	        return 0; 
	    if (n == 1) 
	        return 1; 
	    else
	    { 
	          
	        // Pisano period for % 10 is 60 
	        int rem = (int) (n % 60); 
	  
	        // Checking the remainder 
	        if(rem == 0) 
	        return 0; 
	  
	        // The loop will range from 2 to  
	        // two terms after the remainder 
	        for(int i = 2; i < rem + 3; i++) 
	        { 
	           int f = (f0 + f1) % 60; 
	           f0 = f1; 
	           f1 = f; 
	        } 
	          
	        int s = f1 - 1; 
	        return s; 
	    } 
	}
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        long n = scanner.nextLong();
	        long s = fib(n);
	        System.out.println(s%10);
	    }
	}