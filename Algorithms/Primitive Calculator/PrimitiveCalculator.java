  
import java.util.*;

public class PrimitiveCalculator {
    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        int count[]=new int[n+1];
        count[0]=0;
        count[1]=0;
        
        for(int i=2;i<=n;i++) {
        	if(i<4)
        		count[i]=1;
        	else {
        		if((i%3!=0) && (i%2!=0))
        			count[i]= count[i-1]+1;
        		
        		else if((i%3!=0) && (i%2==0))
        			count[i]= Math.min(count[i/2]+1, count[i-1]+1);
        		
        		else if((i%3==0) && (i%2!=0))
        			count[i]= Math.min(count[i/3]+1, count[i-1]+1);
        		
        		else
        			count[i]= Math.min(count[i/2]+1, count[i/3]+1);
        	}
        }
        
        while (n > 1) {
            sequence.add(n);
            if (n % 3 != 0 && n % 2 != 0) {
                n--;
            } else if (n % 2 == 0 && n % 3 != 0) {
            	
                if(count[n/2]<count[n-1])
                	n=n/2;
                else
                	n--;
            } 
            else if( n % 2 != 0 && n % 3 == 0 )
            {
            	if(count[n/3] < count[n-1])
            		n=n/3;
            	else
            		n--;
            }
            else if(n % 3 == 0 && n % 2 == 0)
            {
            	if(count[n/3]< count[n/2]) {
                	if(count[n/3] < count[n-1])
                		n=n/3;
                	else
                		n--;
            	}
            	else {
            		if(count[n/2]<count[n-1])
                    	n=n/2;
                    else
                    	n--;
            	}
            }
           
        }
        sequence.add(1);
        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}
