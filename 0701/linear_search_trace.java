import java.util.Scanner;
public class linear_search_trace {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,9,10};
        System.out.print("輸入想查詢的數字:");
        int x=cin.nextInt();
        boolean found=false;

        for(int num:a){
            System.out.println("比對中:"+x+"vs"+num);
            if(num==x){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Found");
        }else{
            System.out.println("No");
        }
    }
}
