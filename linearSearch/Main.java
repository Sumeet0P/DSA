public class Main {
    public static void main(String[] args) {
        // O(n) time complexity

        int[] array = {3,4,2,6,5,8,9,0,1,7};
        
        int search = linearSearch(array, 7);

        if(search != -1){
            System.out.println("Value found at index: " + search);
        }else {
            System.out.println("Value not found.");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}