import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = cin.nextInt();
        }

     
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("None");
            cin.close();
            return;
        }

        
        int[] fiveStarIdx = new int[count];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                fiveStarIdx[idx++] = i;
            }
        }

       
        for (int i = 0; i < count; i++) {
            System.out.print(fiveStarIdx[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }

        cin.close();
    }
}
