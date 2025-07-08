
public class BasicArrayOperations {
    public static void main(String[] args) {
        int[] a={15,28,7,43,91,33,66,58,24,81};
    
    for(int i=0;i<a.length;i++){
    
    }
System.out.printf("陣列長度%d\n",a.length);
    a[2]=99;
    a[a.length-1]=100;

    for(int i=0;i<a.length;i++){
        System.out.println(i+":"+a[i]);
    }
}
}