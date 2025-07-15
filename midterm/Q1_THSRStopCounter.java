import java.util.Scanner;
public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

   
        int n = cin.nextInt();
        String[] stops = new String[n];

        for (int i = 0; i < n; i++) {
            stops[i] = cin.next();
        }

        String start = cin.next();
        String end = cin.next();

       
        int startIdx = -1, endIdx = -1;
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIdx = i;
            }
            if (stops[i].equals(end)) {
                endIdx = i;
            }
        }

  
        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIdx - endIdx) + 1);
        }
    }
}


