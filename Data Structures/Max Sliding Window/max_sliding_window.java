

import java.util.LinkedList;
import java.util.Scanner;

public class max_sliding_window{
	public static void main(String[] args) {
		Solution sol= new Solution();
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		int ans[]=sol.maxSlidingWindow(a, k);
		for(int x: ans)
			System.out.print(x+"  ");
		
		
	}
	
	static class Solution{
		public int[] maxSlidingWindow(int[] a, int k) {
			if(a==null||a.length==0)
		        return new int[0];
		 
		    int[] result = new int[a.length-k+1];
		 
		    LinkedList<Integer> deque = new LinkedList<Integer>();
		    for(int i=0; i<a.length; i++){
		        if(!deque.isEmpty()&&deque.peekFirst()==i-k) 
		            deque.poll();
		 
		        while(!deque.isEmpty()&&a[deque.peekLast()]<a[i]){
		            deque.removeLast();
		        }    
		 
		        deque.offer(i);
		 
		        if(i+1>=k)
		            result[i+1-k]=a[deque.peek()];
		    }
		 
		    return result;
		}
	}

}
