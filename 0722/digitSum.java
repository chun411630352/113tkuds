public class digitSum {

public static int digitSum(int n) {
    if (n < 10) {
            return n;
        }
        
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println("digitSum(123) = " + digitSum(123)); 
        System.out.println("digitSum(9999) = " + digitSum(9999)); 
        System.out.println("digitSum(5) = " + digitSum(5)); 
}
}