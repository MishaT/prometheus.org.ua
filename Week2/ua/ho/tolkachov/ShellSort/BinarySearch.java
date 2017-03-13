package ua.ho.tolkachov.ShellSort;

public class BinarySearch {

    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        System.out.println(binSearchForNumber(data, numberToFind));

        // PUT YOUR CODE HERE
    }

    static int binSearchForNumber(int[] data, int numberToFind) {
        int loIndex = 0;
        int hiIndex = data.length - 1;
        int midIndex;
        while (loIndex <= hiIndex) {
            midIndex = loIndex + (hiIndex - loIndex) / 2;
            if (numberToFind < data[midIndex])
                hiIndex = midIndex - 1;
            else if (numberToFind > data[midIndex])
                loIndex = midIndex + 1;
            else
                return midIndex;
        }
        return -1;
    }
}
