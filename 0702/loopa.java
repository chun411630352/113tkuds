

public class loopa {
       public static void main(String[] args) {
        int x=0;
        int count=0;
        for(int i=1;i<=100;i+=2){
            x=x+1;
            count++; //計算執行次數
        }
        System.out.println(count);  //50
}
}