import java.util.Scanner;
public class q3binsearch {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=cin.nextInt();
        }
        int key=cin.nextInt();

        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println(i);
                System.out.println(i-1);
                found=true;
                break;
            }
        }
    }
}
