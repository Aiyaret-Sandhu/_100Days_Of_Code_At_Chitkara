import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        int[] numbers = {-1, 6, 9, 8, 12};
System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest = array[0];
        int idx = 0;
        for (int i = 1 ; i < array.length ; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                idx = i;
            }
        }
        return idx;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your code here
        int smallest = array[startIndex];
        int idx = startIndex;
        for (int i = (startIndex+1) ; i < array.length ; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                idx = i;
            }
        }
        return idx;
    }    

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            int minIdx = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, minIdx);
        }
        System.out.println(Arrays.toString(array));
    }

}
