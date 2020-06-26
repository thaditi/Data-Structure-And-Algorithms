
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(long arr[], int l, int r, long x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    private static void binSearch(long list[], long searchKeys[], int n, int k) {
        int temp_index = 0;

        while (temp_index < k) {
            System.out.print(binarySearch(list, 0, n - 1, searchKeys[temp_index]));
            System.out.print(" ");
            temp_index++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long list[] = new long[n];
        for (int i = 0; i < n; i++)
            list[i] = scanner.nextLong();

        int k = scanner.nextInt();

        long searchKeys[] = new long[k];
        for (int i = 0; i < k; i++)
            searchKeys[i] = scanner.nextLong();

        try {
            binSearch(list, searchKeys, n, k);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        scanner.close();
    }
}