import java.util.Scanner;
public class ds_03 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        System.out.println("輸入姓名年齡城市");
            String name=cin.nextLine();
            int age=cin.nextInt();
            cin.nextLine();
            String city=cin.nextLine();
           
            System.out.print("姓名:"+name+"年齡:"+age+"城市:"+city);
        }
            
    }