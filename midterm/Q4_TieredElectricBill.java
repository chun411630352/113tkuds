import java.util.*;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = Integer.parseInt(cin.nextLine());
        int total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = Integer.parseInt(cin.nextLine());
            int bill = calc(kWh);
            total += bill;
            System.out.println("Bill: $" + bill);
        }

        int avg = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);
    }

    static int calc(int kWh) {
        double cost = 0;
        int remaining = kWh;

        int[] limits = {120, 210, 170, 200, 300, Integer.MAX_VALUE};
        double[] prices = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};

        for (int i = 0; i < limits.length && remaining > 0; i++) {
            int units = Math.min(remaining, limits[i]);
            cost += units * prices[i];
            remaining -= units;
        }

        return (int) Math.round(cost);
    }
}

/*
 * Time Complexity: O(n)
 * 1. 輸入 n 筆資料並逐筆計算電費 → O(n)
 * 2. 每筆計算最多經過 6 個電價區間，每次固定操作 → O(1)
 * 3. 總體為 O(n)
 */
