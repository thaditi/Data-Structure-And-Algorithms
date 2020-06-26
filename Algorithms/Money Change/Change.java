import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int[] notes = new int[] { 10, 5, 1 };
        int[] noteCounter = new int[3];

        // count notes using Greedy approach
        for (int i = 0; i < 3; i++) {
            if (m >= notes[i]) {
                noteCounter[i] = m / notes[i];
                m = m - noteCounter[i] * notes[i];
            }
        }

        // Print notes
        int res = 0;
        for (int i = 0; i < 3; i++)
            res += noteCounter[i];
        return res;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}