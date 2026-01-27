import java.util.ArrayList;
import java.util.Arrays;

public class BidimensionalSort {
    public static void main(String[] args) {
        int[][] array1 = new int[][] {
            {1,2,4},
            {6,8,9}
        };
        System.out.println("Array1 (desc): " + Arrays.toString(SortArrayBubble(array1, false)));
        int[][] array2 = new int[][] {
            {9,8,5},
            {4,2,1}
        };
        System.out.println("Array2 (asc): " + Arrays.toString(SortArrayBubble(array2, true)));
        int[][] array3 = new int[][] {
            {9,2,5},
            {4,8,1}
        };
        System.out.println("Array3 (asc): " + Arrays.toString(SortArrayBubble(array3, true)));
        int[][] array4 = new int[][] {
            {9,8,5,2,5,5,67,7},
            {4,2,1,12,34,56}
        };
        System.out.println("Array4 (desc): " + Arrays.toString(SortArrayBubble(array4, false)));
        int[][] array5 = new int[][] {
            {9,8,5,34,67,69,21,-12,43,3,4,3,4},
            {4,2,1,3,8,9,7,12,13,12,11,34},
            {123,245,1,-3,87,420,42}
        };
        System.out.println("Array5 (asc): " + Arrays.toString(SortArrayBubble(array5, true)));
    }

    public static int[] SortArrayBubble(int[][] array, boolean asc) {
        //Big O =  O(N^2)
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayList.add(array[i][j]);
            }
        }
        int[] result =  arrayList.stream().mapToInt(i -> i).toArray();
        int lastIndexToOrder = result.length - 1;

        while (lastIndexToOrder > 0) {
            for (int i = 0; i < lastIndexToOrder; i++) {
                if ((asc && result[i] > result[i+1]) || (!asc && result[i] < result[i+1])) {
                    int temp = result[i];
                    result[i] = result[i+1];
                    result[i+1] = temp;
                }
            }
            lastIndexToOrder--;
        }
        return  result;        
    }
}
