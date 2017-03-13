package ua.ho.tolkachov.ShellSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testSearchForNumber() {
        int[] arraySource = { 3, 6, 7, 10, 34, 56, 60 };
        assertEquals(3, BinarySearch.binSearchForNumber(arraySource, 10));

        int[] arraySource2 = { 66, 29, 30, 42, 44, 55, 58, 60, 65, 66, 85 };
        assertEquals(8, BinarySearch.binSearchForNumber(arraySource2, 65));

        int[] arraySource3 = { 101, 29, 30, 42, 44, 55, 58, 60, 65, 66, 85 };
        assertEquals(-1, BinarySearch.binSearchForNumber(arraySource3, 100));
    }

}
