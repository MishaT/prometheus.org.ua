package ua.ho.tolkachov.ArraySort;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = { 30, 2, 10, 4, 6 };
        int length = array.length;

        bubbleSort(array);

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    int tempValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempValue;
                }
            }

        }
    }
}
