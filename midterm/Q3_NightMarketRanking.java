import java.util.*;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = Integer.parseInt(cin.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(cin.nextLine());
        }

     
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        int limit = Math.min(5, n);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }
    }
}
/*
 * Time Complexity: O(n^2)
 * 1. 外層迴圈執行 n 次，每次內層搜尋剩下最大值：O(n)
 * 2. 所以總共為 O(n^2)，符合選擇排序特性
 */
