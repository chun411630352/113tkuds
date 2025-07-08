public class ArrayStatistics {
    public static void main(String[] args) {
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0;
        int max = data[0];
        int min = data[0];
        int maxIndex = 0;
        int minIndex = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < data.length; i++) {
            int num = data[i];
            sum += num;

            if (num > max) {
                max = num;
                maxIndex = i;
            }
            if (num < min) {
                min = num;
                minIndex = i;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / data.length;

        // 計算大於平均的數量
        int aboveAverageCount = 0;
        for (int num : data) {
            if (num > average) {
                aboveAverageCount++;
            }
        }

        // 輸出統計結果（表格形式）
        System.out.println("┌──────────────────────────┬────────┐");
        System.out.printf("│ %-21s │ %6d │%n", "總和 (Sum)", sum);
        System.out.printf("│ %-21s │ %6.2f │%n", "平均值 (Average)", average);
        System.out.printf("│ %-21s │ %6d │%n", "最大值 (Max)", max);
        System.out.printf("│ %-21s │ %6d │%n", "最大值索引 (Index)", maxIndex);
        System.out.printf("│ %-21s │ %6d │%n", "最小值 (Min)", min);
        System.out.printf("│ %-21s │ %6d │%n", "最小值索引 (Index)", minIndex);
        System.out.printf("│ %-21s │ %6d │%n", "大於平均值數量", aboveAverageCount);
        System.out.printf("│ %-21s │ %6d │%n", "偶數數量", evenCount);
        System.out.printf("│ %-21s │ %6d │%n", "奇數數量", oddCount);
        System.out.println("└──────────────────────────┴────────┘");
    }
}
