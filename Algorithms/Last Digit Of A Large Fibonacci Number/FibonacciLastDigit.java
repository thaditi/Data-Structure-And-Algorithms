import java.util.Scanner;

public class FibonacciLastDigit {
	static void fib(int f[]) 
    { 
        // 0th and 1st number of  
        // the series are 0 and 1 
        f[0] = 0; 
        f[1] = 1; 
  
        // Add the previous 2 numbers  
        // in the series and store  
        // last digit of result  
        for (int i = 2; i <= 59; i++) 
            f[i] = (f[i - 1] + f[i - 2]) % 10; 
    } 
  
    // Returns last digit of n'th Fibonacci Number 
    static int findLastDigit(int n) 
    { 
        // In Java, values are 0 by default 
        int f[] = new int[60]; 
  
        // Precomputing units digit of  
        // first 60 Fibonacci numbers 
        fib(f); 
      
        int index = (int)(n % 60L);  
  
        return f[index]; 
    } 

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int c = findLastDigit(n);
        System.out.println(c);
    }
}