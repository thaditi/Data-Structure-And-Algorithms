import java.util.Scanner;

public class ChangeDP {
	private static int[] coins= {1,3,4};
    private static int getChange(int m) {
        int minNumCoins[]= new int[m+1];
        int noOfCoins=0;
        minNumCoins[0]=0;
        for(int i=1;i<=m;i++) {
        	minNumCoins[i]=Integer.MAX_VALUE;
        	for(int j=0; j<3;j++) {
        		if(coins[j]<=i) {
        			noOfCoins= minNumCoins[i-coins[j]]+1;
        		}
        		if(noOfCoins< minNumCoins[i]) {
        			minNumCoins[i]= noOfCoins;
        		}
        	}
        }
        
        return minNumCoins[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}