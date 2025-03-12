/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.algoritmidiordinamento;

import java.util.Arrays;

/**
 *
 * @author shwak
 */
public class Client {
    public static void main(String[] args) {
        int arrayDim =8;
        int rangerandom =20;// fino a 20
        Context context = new Context(new BubbleSortStrategy(), arrayDim);
        context.generateRandomNumbers(1, rangerandom);
        context.executeSort();
        System.out.println("Array ordinato: " + Arrays.toString(context.getArray()));
        
        context.setStrategy(new QuickSortStrategy());
        context.generateRandomNumbers(1, rangerandom);
        context.executeSort();
        System.out.println("Array ordinato: " + Arrays.toString(context.getArray()));
        
        context.setStrategy(new SelectionSortStrategy());
        context.generateRandomNumbers(1, rangerandom);
        context.executeSort();
        System.out.println("Array ordinato: " + Arrays.toString(context.getArray()));
    }
}

