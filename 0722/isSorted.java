public class isSorted {

    public static boolean isSorted(int[] arr, int index) {
        
        if (index >= arr.length - 1) {
            return true;
        }


        if (arr[index] > arr[index + 1]) {
            return false;
        }


        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {3, 2, 1};
        int[] a3 = {5};
        int[] a4 = {1, 1, 2, 2, 3}; 

        System.out.println("a1 是否升序？" + isSorted(a1, 0)); 
        System.out.println("a2 是否升序？" + isSorted(a2, 0)); 
        System.out.println("a3 是否升序？" + isSorted(a3, 0)); 
        System.out.println("a4 是否升序？" + isSorted(a4, 0)); 
    }
}

