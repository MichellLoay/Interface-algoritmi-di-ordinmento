/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.algoritmidiordinamento;

/**
 *
 * @author shwak
 */
public class SelectionSortStrategy implements IStrategy {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minimo]) {
                    minimo = j;
                }
            }
            int temp = array[minimo];
            array[minimo] = array[i];
            array[i] = temp;
        }
        System.out.println("Array ordinato con Selection Sort");
    }
}

