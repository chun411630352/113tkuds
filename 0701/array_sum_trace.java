
public class array_sum_trace {
public static int sum(int[] arr, int n){
    int total=0;
    for(int i=0;i<n;i++){
        int a=total;
        total+=arr[i];

        System.out.println("加總過成:total="+a+"+"+arr[i]+"="+total);
    }
    return total;
}
public static void main(String[] args) {
    int[] data={1,2,3,4,5,6,7,8,9,10};
    int result=sum(data,data.length);
    System.out.println("陣列總和為："+result);
}
}

//時間複雜度：O(n),n為陣列長度