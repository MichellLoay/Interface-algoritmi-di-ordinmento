package pentamester.algoritmidiordinamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import pentamester.algoritmidiordinamento.IStrategy;

/**
 *
 * @author shwak
 */
public class QuickSortStrategy implements IStrategy {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        System.out.println("Array ordinato con Quick Sort");
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int camb = partition(array, low, high);
            quickSort(array, low, camb - 1);
            quickSort(array, camb + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}

