import java.util.*;
import java.io.*;

public class MaxPairProduct {
    static long getMaxPairwiseProduct(int[] numbers) {

        int n = numbers.length;

        int max_index1 = 0;

        for (int first = 0; first < n; ++first)
            if ((max_index1 == 0) || (numbers[first] > numbers[max_index1]))
                max_index1 = first;

        int max_index2 = 0;

        for (int second = 0; second < n; ++second)
            if ((second != max_index1) && ((max_index2 == 0) || (numbers[second] > numbers[max_index2])))
                max_index2 = second;

        return ((long) numbers[max_index1] * numbers[max_index2]);
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}