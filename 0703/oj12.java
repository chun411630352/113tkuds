import java.util.Scanner;

public class oj12 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j != i || i > 1) System.out.print(" ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
                if (j != 1) System.out.print(" ");
            }

            System.out.println(); // 換行
        }
    }
}
