import java.util.Scanner;
public class q5matrixmul {
    public static void main(String[] args) {
        
    Scanner cin=new Scanner(System.in);
    int n=cin.nextInt();
    int count=0;
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j]=cin.nextInt();
        
            }
        }
    int[][] b=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            b[i][j]=cin.nextInt();
        }
    }
    int[][] c=new int[n][n];
    for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 for (int k = 0; k < n; k++) {
                    count++;
                    c[i][j] += a[i][k] * b[k][j];
               
            }
            
        }
    }
     for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
            
        }
        System.out.println(count);
}
}
