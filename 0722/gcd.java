public class gcd{
public static int gcd(int a, int b) {
    if (b == 0) {
            return a;
        }
        // 遞迴關係：gcd(a, b) = gcd(b, a % b)
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("gcd(48, 18) = " + gcd(48, 18)); // 6
        System.out.println("gcd(100, 25) = " + gcd(100, 25)); // 25
        System.out.println("gcd(7, 3) = " + gcd(7, 3)); // 1
    }
}