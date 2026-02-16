public class Main {
    public static void main(String[] args) {
        // O(log n) time complexity

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int search = binarySearch(array, 10);

        if (search == -1) {
            System.out.println("Value not found.");
        } else {
            System.out.println("Value found at index: " + search);
        }
    }

    private static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
