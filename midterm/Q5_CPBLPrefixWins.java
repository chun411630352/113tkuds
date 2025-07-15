import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = Integer.parseInt(cin.nextLine());
        int[] a = new int[n];
        String[] tokens = cin.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }

        int k = Integer.parseInt(cin.nextLine());

        int[] ps = new int[n + 1]; 
        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + a[i - 1];
        }

        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();
    }
}
/*
 * Time Complexity: O(n)
 * 1. 輸入 n 筆勝敗紀錄並建構前綴和陣列 → O(n)
 * 2. 輸出前 k 筆前綴勝場 → O(k)，但 k ≤ n，所以仍為 O(n)
 */
