import java.util.Scanner;

public class q6fibonaccirec {
    static int count = 0;

    public static int fib(int n) {
        count++; 
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        System.out.println(fib(n));
        System.out.println(count);
        cin.close();
    }
}
