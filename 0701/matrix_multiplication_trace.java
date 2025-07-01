
public class matrix_multiplication_trace {
    public static void main(String[] args) {
        int [][] a={
                {1,2},{3,4}
        };
        int [][] b={
                {5,6},{7,8}
        };
        int [][] c=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int sum = 0;
                String expr = "";
                String calc = "";
                for(int k=0;k<2;k++){
                 int product = a[i][k] * b[k][j];
                 sum += product;
                    // 累積表達式
                    if (k > 0) {
                        expr += " + ";
                        calc += " + ";
                    }
                    expr += a[i][k] + " * " + b[k][j];
                    calc += product;
                }
                c[i][j] = sum;
                System.out.println("計算位置 c[" + i + "][" + j + "]：" + expr + " = " + calc + " = " + sum);
            }
        }
    }
}

//有三層迴圈，每層次數為n 時間複雜度為O(n的三次)