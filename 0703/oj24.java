import java.util.Scanner;

public class oj24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long fact = 1;

        for (int i = 2; i <= N; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
