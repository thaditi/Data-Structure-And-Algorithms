
import java.util.*;

public class Partition3 {
	
	static boolean isPartitionPossibleRec(int arr[], int subsetSum[], boolean taken[], 
            int subset, int N, int curIdx, int limitIdx) 
{ 
if (subsetSum[curIdx] == subset) 
{ 
    
    if (curIdx == 3 - 2) 
        return true; 

    return isPartitionPossibleRec(arr, subsetSum, taken, subset, 
                                         N, curIdx + 1, N - 1); 
} 

for (int i = limitIdx; i >= 0; i--) 
{ 
    if (taken[i]) 
        continue; 
    int tmp = subsetSum[curIdx] + arr[i]; 

    if (tmp <= subset) 
    { 
       
        taken[i] = true; 
        subsetSum[curIdx] += arr[i]; 
        boolean nxt = isPartitionPossibleRec(arr, subsetSum, taken, 
                                        subset, N, curIdx, i - 1); 

       
        taken[i] = false; 
        subsetSum[curIdx] -= arr[i]; 
        if (nxt) 
            return true; 
    } 
} 
return false; 
} 


static boolean partition3(int arr[], int N) 
{ 

if (N < 3) 
    return false; 

 
int sum = 0; 
for (int i = 0; i < N; i++) 
    sum += arr[i]; 
if (sum % 3 != 0) 
    return false; 

int subset = sum / 3; 
int []subsetSum = new int[3]; 
boolean []taken = new boolean[N]; 


for (int i = 0; i < 3; i++) 
    subsetSum[i] = 0; 

for (int i = 0; i < N; i++) 
    taken[i] = false; 


subsetSum[0] = arr[N - 1]; 
taken[N - 1] = true; 

return isPartitionPossibleRec(arr, subsetSum, taken, 
                                subset, N, 0, N - 1); 
}  
	    
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
       if(partition3(A,n))
    	   System.out.println("1");
       else
    	   System.out.println("0");
    }
}

