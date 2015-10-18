# Data-Structure
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Justice
 */
public class BubbleSort extends Sort {

    public BubbleSort(int[] numbers) {
        super(numbers);
    }

    public void sortAscending() {
        System.out.println("\n\nBegin BubbleSort Algorithm [ASCENDING]");
        for (int x = 0; x < this.numbers.length - 1; x++) {
            for (int y = 0; y < this.numbers.length - 1; y++) {
                if (this.compare(y, y + 1) == y) {
                    this.swap(y, y + 1);
                }
            }
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }

    public void sortDescending() {
        System.out.println("\n\nBegin BubbleSort Algorithm [DESCENDING]");
        for (int x = 0; x < this.numbers.length - 1; x++) {
            for (int y = 0; y < this.numbers.length - 1; y++) {
                if (this.compare(y + 1, y) == y + 1) {
                    this.swap(y + 1, y);
                }
            }
        }
        System.out.print("\nResult After Sorting: ");
        this.displayNumbers();
    }
}
