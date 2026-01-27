import java.util.Arrays;

public class SnailPattern {
    public static void main(String[] args) {
        int[][] array3x3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] array4x4 = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 6, 9, 7}
        };
        int[][] array2x2 = {
                {1, 4},
                {0, 2}
        };
        int[][]array1x1 = {{6}};
        int[][] arrayEmpty = {{}};

        System.out.println("3x3: " + Arrays.toString(snail(array3x3)));
        System.out.println("4x4: " + Arrays.toString(snail(array4x4)));
        System.out.println("2x2: " + Arrays.toString(snail(array2x2)));
        System.out.println("1x1: " + Arrays.toString(snail(array1x1)));
        System.out.println("Empty: " + Arrays.toString(snail(arrayEmpty)));
    }

    public static int[] snail(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        int size = array.length;
        int[] result = new int[size * size];
        int index = 0;

        int top = 0;
        int bottom = size - 1;
        int left = 0;
        int right = size - 1;

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                result[index++] = array[top][col];
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                result[index++] = array[row][right];
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result[index++] = array[bottom][col];
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result[index++] = array[row][left];
                }
                left++;
            }
        }
        return result;
    }
}
