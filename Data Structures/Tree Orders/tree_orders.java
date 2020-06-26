

import java.util.*;
import java.io.*;

class tree_orders {
    class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
	
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public class TreeOrders {
		int n;
		int root;
		int[] key, left, right;
		int[] isRoot;
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			key = new int[n];
			left = new int[n];
			right = new int[n];
			isRoot = new int[n];
			for (int i = 0; i < n; i++) { 
				key[i] = in.nextInt();
				left[i] = in.nextInt();
				right[i] = in.nextInt();
				if (left[i] != -1)
					isRoot[i] = 1;
				if (right[i] != -1)
					isRoot[i] = 1;
			}
			Arrays.sort(isRoot);
			root = isRoot[0];
		}
		void iter_inorder(int root, ArrayList<Integer> r) { 
			Stack<Integer> st = new Stack<>();
			int x = root;
			while (true) {
				while (x != -1) { 
					st.push(x);
					x = left[x];
				}
				if (st.empty())
					break;
				x = st.peek(); 
				r.add(key[x]); 
				st.pop();
				x = right[x]; 
			}
		}
		void iter_preorder(int root, ArrayList<Integer> r) { 
			Stack<Integer> st = new Stack<>();
			int x = root;
			while (true) {
				while (x != -1) {      
					r.add(key[x]); 
					if (right[x] != -1)  
						st.add(right[x]); 
					x = left[x];        
				}
				if (st.empty())
					break;
				x = st.peek();
				st.pop();
			}
		}
		void iter_postorder(int root, ArrayList<Integer> r) { 
			Stack<Integer> st = new Stack<>();
			int x = root;
			if (x != -1)
				st.push(x);
			while (!st.empty()) {
				if (left[st.peek()] != x &&
						right[st.peek()] != x) { 
					
					while ((x = st.peek()) != -1) {
						if (left[x] != -1) { 
							if (right[x] != -1)
								st.push(right[x]);
							st.push(left[x]);
						} else
							st.push(right[x]);
					}
					st.pop(); 
				}
				x = st.peek();
				r.add(key[x]); 
				st.pop();
			}
		}

		List<Integer> inOrder() {
			ArrayList<Integer> result = new ArrayList<Integer>();
                        // Finish the implementation
                        // You may need to add a new recursive method to do that
			 iter_inorder(root,result);
			return result;
		}

		List<Integer> preOrder() {
			ArrayList<Integer> result = new ArrayList<Integer>();
                        // Finish the implementation
                        // You may need to add a new recursive method to do that
                     iter_preorder(root,result);    
			return result;
		}

		List<Integer> postOrder() {
			ArrayList<Integer> result = new ArrayList<Integer>();
                        // Finish the implementation
                        // You may need to add a new recursive method to do that
			
			 iter_postorder(root,result);
			return result;
		}
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_orders().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}

	public void print(List<Integer> x) {
		for (Integer a : x) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public void run() throws IOException {
		TreeOrders tree = new TreeOrders();
		tree.read();
		print(tree.inOrder());
		print(tree.preOrder());
		print(tree.postOrder());
	}
}
