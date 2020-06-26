
import java.util.*;

class EditDistance {
	static int min(int a, int b, int c) {
		if((a<=b) && (a<=c))
			return a;
		else if((b<=c) && (b<=a))
			return b;
		else
			return c;
	}
	
   private static int EditDistance(String s, String t, int lenS, int lenT) {
    
       int dp[][] = new int[lenS + 1][lenT + 1]; 
 
        
       for (int i = 0; i <= lenS; i++) { 
           for (int j = 0; j <= lenT; j++) { 
        
               if (i == 0) 
                   dp[i][j] = j; // Min. operations = j 
 
               else if (j == 0) 
                   dp[i][j] = i; // Min. operations = i 
 
               else if (s.charAt(i - 1) == t.charAt(j - 1)) 
                   dp[i][j] = dp[i - 1][j - 1]; 
 
               else
                   dp[i][j] = 1 + min(dp[i][j - 1], // Insert 
                                      dp[i - 1][j], // Remove 
                                      dp[i - 1][j - 1]); // Replace 
           } 
       } 
 
       return dp[lenS][lenT]; 
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();

    System.out.println(EditDistance(s, t, s.length(), t.length()));
  }

}
