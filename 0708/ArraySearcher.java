
public class ArraySearcher {
     static int findElement(int[] array,int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int countOccurrences(int[] array,int target){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array={12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        int target1=67;
        int target2=100;
        
        int index1=findElement(array, target1);
        int index2=findElement(array, target2);

        if(index1 !=-1){
            System.out.println(target1+":"+index1);
        }else{
            System.out.println("-1");
        }
       if(index2 !=-1){
            System.out.println(target2+":"+index2);
        }else{
            System.out.println("-1"); 
        int result1=countOccurrences(array, target1);
        int result2=countOccurrences(array, target2);
        System.out.println(target1+"出現了:"+result1+"次");
        System.out.println(target2+"出現了:"+result2+"次");
    }
}
}
