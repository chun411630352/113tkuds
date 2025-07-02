
public class array_mode_count {
    public static void main(String[] args) {
        int[] arr={3, 7, 3, 1, 1, 1};
        int mode=arr[0];
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            System.out.print("比對中："+arr[i]+"出現次數＝");
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                count++;
                System.out.print("");
            }
        }
    System.out.println( count + " 次");
            if (count > maxcount) {
                maxcount = count;
                mode = arr[i];
            }
        }
        System.out.println("\n眾數為：" + mode);
        System.out.println("出現次數：" + maxcount);
    }
}

//有兩層迴圈，每層次數為n 時間複雜度為O(n的兩次)
//可以，先將陣列進行排序再用二元搜尋