import java.util.Scanner;
public class q2seqsearch {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt(); 
        int[] arr=new int[n];
        

        for(int i=0;i<n;i++){
            arr[i]=cin.nextInt();
            
        }
        int key=cin.nextInt();

        //線性搜尋
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Yes");
                System.out.println(i+1);
                found=true;
                break;
            }
        }
    }
}
