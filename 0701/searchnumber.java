import java.util.Scanner;
public class searchnumber {
        public static void main(String[] args) {
        int[] s={1,3,5,7,9,11,13};
        Scanner cin= new Scanner(System.in);
        System.out.print("輸入想選找的數字:");
        int x=cin.nextInt();
        boolean found=false;

        //線性搜尋
        for(int num:s){
            System.out.println("比對中數字："+num);//印出正在比對的數字
            if(num==x){
                found=true;
               break;
            }
        }
        //輸出結果
        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
            
        }
    }

