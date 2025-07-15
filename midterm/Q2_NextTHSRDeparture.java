import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = Integer.parseInt(cin.nextLine());
        int[] times = new int[n];
        String[] timeStrs = new String[n];

        for (int i = 0; i < n; i++) {
            String t = cin.nextLine();
            timeStrs[i] = t;
            times[i] = toMinutes(t);
        }

        String query = cin.nextLine();
        int queryMinutes = toMinutes(query);

        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > queryMinutes) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == n) {
            System.out.println("No train");
        } else {
            System.out.println(timeStrs[ans]);
        }
    }

    static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}


  /*
 * Time Complexity: O(log n)
 * 1. 將 n 個時間字串轉成整數分鐘數陣列：O(n)
 * 2. 對已排序的時間做 binary search：O(log n)
 */

