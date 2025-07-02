import java.util.Scanner;
public class q4paircount {
public static void main(String[] args) {
    Scanner cin=new Scanner(System.in);
    int n=cin.nextInt();
    int [] arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=cin.nextInt();
    
    }
    int paircount=n*(n-1)/2;
    System.out.println(paircount);
}
}
