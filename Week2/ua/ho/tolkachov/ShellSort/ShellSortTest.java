package ua.ho.tolkachov.ShellSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShellSortTest {

    @Test
    public void testShellSort() {
        int[] arraySource = { 30, 2, 10, 4, 6 };
        int[] arrayExpected = { 2, 4, 6, 10, 30 };
        ShellSort.shellSort(arraySource);
        assertArrayEquals(arrayExpected, arraySource);
    }

}
