
public class ArrayUtility {
    
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // 原地反轉陣列
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

   
    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.print("陣列：");
        printArray(array);

        System.out.print("反轉陣列：");
        reverseArray(array);
        printArray(array);

        System.out.print("複製陣列：");
        int[] copied = copyArray(array);
        printArray(copied);

        System.out.print("第二大數值：");
        System.out.println(findSecondLargest(array));
    }
}


