public class Main {
    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        selectionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
    }
}
