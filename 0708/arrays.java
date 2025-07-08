public class arrays {
    public static void main(String[] args){
        int [] number={1,2,3,4,5};
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
            System.out.println("Index:"+i);
            System.out.println("佔用位元組:"+Integer.BYTES+"Bytes");
            System.out.println("佔用位元組:"+Double.BYTES+"Bytes");
        }
    }
}