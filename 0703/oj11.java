import java.util.Scanner;

public class oj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

       
        int[] colSum = new int[m];
        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i][j];
            }
            colSum[j] = sum;
        }

        
        for (int j = 0; j < m; j++) {
            System.out.print(colSum[j]);
            if (j != m - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
