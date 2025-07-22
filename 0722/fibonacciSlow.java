public class fibonacciSlow {


    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }

    
    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 35; 

        
        long startTime1 = System.currentTimeMillis();
        int resultSlow = fibonacciSlow(n);
        long endTime1 = System.currentTimeMillis();
        System.out.println("fibonacciSlow(" + n + ") = " + resultSlow);
        System.out.println("Time (Slow): " + (endTime1 - startTime1) + "ms");

        System.out.println();

       
        int[] memo = new int[n + 1]; 
        long startTime2 = System.currentTimeMillis();
        int resultFast = fibonacciFast(n, memo);
        long endTime2 = System.currentTimeMillis();
        System.out.println("fibonacciFast(" + n + ") = " + resultFast);
        System.out.println("Time (Fast): " + (endTime2 - startTime2) + "ms");

        System.out.println("\n差異分析:fibonacciFast 比 fibonacciSlow 快了約 " +
                ((endTime1 - startTime1) / Math.max(1, (endTime2 - startTime2))) + " 倍");
    }
}
