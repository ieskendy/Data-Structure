# Data-Structure
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justice
 */
public class QuickSort extends Sort {

    public QuickSort(int[] numbers) {
        super(numbers);
    }

    public void sortAscending() {
        this.quicksort(0, this.numbers.length - 1);
    }

    public void quicksort(int low, int high) {
        int start = low;
        int end = high;
        // Get the pivot element
        int pivotIndex = low + (high - low) / 2;
        int pivot = this.numbers[pivotIndex];

        while (start < end) {
            while (this.numbers[start] < pivot) {
                start++;
            }
            while (numbers[end] > pivot) {
                end--;
            }
            if (start <= end) {
                this.swap(end, end);
                start++;
                end--;
            }
        }
        if (low < end) {
            this.quicksort(low, end);xxx
        }
        if (start < high) {
            this.quicksort(start, high);
        }
    }
}
