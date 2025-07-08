public class StudentGradeSystem {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        char[] grades = new char[scores.length];

        int countA = 0, countB = 0, countC = 0, countD = 0;
        int maxScore = scores[0], minScore = scores[0];
        int maxIndex = 0, minIndex = 0;
        int sum = 0;

        // 計算等級與統計最大、最小分數
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            if (score > maxScore) {
                maxScore = score;
                maxIndex = i;
            }
            if (score < minScore) {
                minScore = score;
                minIndex = i;
            }

            if (score >= 90) {
                grades[i] = 'A';
                countA++;
            } else if (score >= 80) {
                grades[i] = 'B';
                countB++;
            } else if (score >= 70) {
                grades[i] = 'C';
                countC++;
            } else {
                grades[i] = 'D';
                countD++;
            }
        }

        double average = (double) sum / scores.length;

        // 計算高於平均分的學生數量
        int aboveAvgCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAvgCount++;
            }
        }
        double aboveAvgRatio = (double) aboveAvgCount / scores.length * 100;

        printReport(scores, grades, countA, countB, countC, countD, maxScore, maxIndex, minScore, minIndex, average, aboveAvgRatio);
    }

    public static void printReport(int[] scores, char[] grades, int countA, int countB, int countC, int countD,
                                   int maxScore, int maxIndex, int minScore, int minIndex,
                                   double average, double aboveAvgRatio) {
        System.out.println("學生分數等級報告");
        System.out.println("==============================================");
        System.out.println("統計摘要:");
        System.out.printf("總學生數：%d\n", scores.length);
        System.out.printf("平均分數：%.2f\n", average);
        System.out.printf("最高分：%d (學生編號 %d)\n", maxScore, maxIndex + 1);
        System.out.printf("最低分：%d (學生編號 %d)\n", minScore, minIndex + 1);
        System.out.printf("等級人數 - A: %d, B: %d, C: %d, D: %d\n", countA, countB, countC, countD);
        System.out.printf("高於平均分學生比例：%.2f%%\n", aboveAvgRatio);
        System.out.println("----------------------------------------------");
        System.out.println("詳細列表:");
        System.out.println("編號\t分數\t等級");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%c\n", i + 1, scores[i], grades[i]);
        }
        System.out.println("==============================================");
    }
}
