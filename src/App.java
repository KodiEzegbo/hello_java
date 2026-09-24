public class App {
    
    public static void swap_values(int arr[]) {
    
    if (arr == null || arr.length != 2) {
        throw new IllegalArgumentException("Array must have only 2 elements");
    }

    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    }

    /**
     * Display elements of an array
     * @param arr the array to display
     */
    public static void printArray(int arr[]) {
        System.out.print("Array: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) throws Exception {
        
        // initialize array of length 2
        int[] x = new int[]{1,2};

        // print the elements of the array
        printArray(x);

        // TO DO: write method to swap the values
        swap_values(x);

        // print the elements of the array
        printArray(x);

    }
}

