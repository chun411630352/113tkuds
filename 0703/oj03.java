import java.util.Scanner;

public class oj03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String input = cin.nextLine();         

        String[] parts = input.split("\\+");   
        int a = Integer.parseInt(parts[0]);    
        int b = Integer.parseInt(parts[1]);    

        System.out.println(a + b);             
    }
}