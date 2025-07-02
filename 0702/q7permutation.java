import java.util.Scanner;
public class q7permutation {
    static int ops = 0;
   public static void main(String[] args) {
  
    

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) nums[i] = i + 1;
        permute(nums, used, new int[n], 0);
        System.out.println(ops);
        cin.close();
    }

    static void permute(int[] nums, boolean[] used, int[] path, int depth) {
        if (depth == nums.length) {
            ops++; // 只在產生一個排列時加一
            for (int i = 0; i < nums.length; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(path[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                path[depth] = nums[i];
                permute(nums, used, path, depth + 1);
                used[i] = false;
            }
        }
    }
}

   
