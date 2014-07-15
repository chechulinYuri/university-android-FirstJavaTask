package com.noveogroup.algorithm;

import com.noveogroup.device.Device;

/**
 * Created by Admin on 15.07.14.
 */
public class QuickSort extends AbstractAlgorithm {

    private Device[] numbers;
    private int number;
    private boolean asc;

    public void sort(Device[] devices, boolean ascendingSort) {
        this.numbers = devices;
        number = devices.length;
        asc = ascendingSort;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        Device pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i].compareTo(pivot) > 0 && !asc || numbers[i].compareTo(pivot) < 0 && asc) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j].compareTo(pivot) < 0 && !asc || numbers[j].compareTo(pivot) > 0 && asc) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        Device temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
