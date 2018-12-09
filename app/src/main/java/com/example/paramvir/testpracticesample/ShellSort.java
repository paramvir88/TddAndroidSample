package com.example.paramvir.testpracticesample;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {

        int[] items = {21, 15, 28, 2, 35, 4, 11, 9, 8, 55, 37, 3, 5, 12, 13, 14, 18, 68,36, 45, 99, 81, 100, 72, 33, 40, 70, 60, 61, 62, 63, 64, 65};
        System.out.println("Original ITEMS = " + Arrays.toString(items));
        new ShellSort().selectionSort(items);
        System.out.println("Final array AFTER sorting = " + Arrays.toString(items));
    }

    private void insertionSort(int[] items) {
        //pick first item and compare with 0th index, replace if needed
        //with n items sorted in the array, pick n+1th item -> copy in 'a'
        // compare with 0th index, if smaller, swap 0th with a
        //swap a with 1st -> 1st with 2nd and so on ->


        for (int i = 1; i < items.length; i++) {
            System.out.println("The array AFTER " + i + " iteration is: " + Arrays.toString(items));
            for (int j = 0; j < i; j++) {
                System.out.println("Now j is " + j + " and items[j] = " + items[j]);
                System.out.println("Now i is " + i + " and items[i] = " + items[i]);
                if (items[i] < items[j]) {
                    System.out.println("Now i is smaller than j so inserting");
                    insertItem(items, j, i);
                } else {
                    System.out.println("Now i is NOT smaller than j so NOTHING.");
                }
            }
        }
    }


    public void insertItem(int[] items, int indexToBeInserrted, int indexOfItemToBeInserted) {
        System.out.println("INSERTION started");
        int temp = items[indexOfItemToBeInserted];
        for (int i = indexToBeInserrted; i <= indexOfItemToBeInserted; i++) {
            System.out.println("The swapped item is " + temp);
            temp = swap(items, i, temp);
            System.out.println("The array after swapping = " + Arrays.toString(items));
        }
    }

    /**
     * swap item
     */
    public int swap(int[] items, int index, int temp) {
        // a = 8, b = 14
        temp = items[index] + temp;
        items[index] = temp - items[index];
        temp = temp - items[index];
        return temp;

    }

    public void insertOneItem(int[] items, int startIndex, int endIndex, int insertedItem) {
        int ousted = items[startIndex];
        //items[startIndex] = insertedItem;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            insertedItem = swap(items, i, insertedItem);
            System.out.println("The swapped item is " + insertedItem);
        }
    }


    private void insertionSortImproved(int[] items) {
        int temp;
        for (int i = 1; i < items.length; i++) {
            System.out.println("The array AFTER " + i + " iteration is: " + Arrays.toString(items));
            for (int j = i; j > 0 && items[j] < items[j - 1]; j--) {
                temp = items[j];
                items[j] = items[j - 1];
                items[j - 1] = temp;
            }
        }
    }


    private void bubbleSort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("The array AFTER " + i + " iteration is: " + Arrays.toString(items));
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    private void selectionSort(int[] items) {

        int iterations = 0;
        int comparisons = 0;
        int copies = 0;
        for (int i = 0; i < items.length; i++) {
            iterations++;
            comparisons++;
            int max = items[0];
            System.out.println("The array AFTER " + i + " iteration is: " + Arrays.toString(items));
            for (int j = 1; j < items.length - i; j++) {
                comparisons++;
                iterations++;
                if (items[j] > max) {
                    comparisons++;
                    copies++;
                    int temp = max;
                    max = items[j];
                    items[j] = temp;
                }
            }
            items[0] = items[items.length - i - 1];
            copies++;
            items[items.length - i - 1] = max;
        }
        System.out.println("Itermations = " + iterations + ", copies = "+copies + ", comparisons = " + comparisons);
    }

}
