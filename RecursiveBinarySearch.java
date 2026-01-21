public class RecursiveBinarySearch {
    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(new int[] {2, 4, 7, 10, 13}, 0, 4, 10));
        System.out.println(recursiveBinarySearch(new int[] {2, 16, 23, 38}, 0, 3, 2));
        System.out.println(recursiveBinarySearch(new int[] {2, 5, 8, 12, 16, 23, 38}, 0, 6, 50));
    }

    public static int recursiveBinarySearch(int[] arr, int index, int lastIndex, int itemToFind) {
        if (index > lastIndex) {
            return -1;
        }
        if (arr[index] == itemToFind) {
            return index;
        } else {
            index++;
            return recursiveBinarySearch(arr, index, lastIndex, itemToFind);
        }
    }
}
