/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pentamester.algoritmidiordinamento;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author shwak
 */
public class Context {

    private IStrategy strategy;
    private int[] array;

    public Context(IStrategy strategy, int size) {
        this.strategy = strategy;
        this.array = new int[size];
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateRandomNumbers(int inf, int sup) {
        Random random = new Random();
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(sup - inf + 1) + inf;

        }
        System.out.println("array generato: " +  Arrays.toString(array));
    }

    public void executeSort() {
        if (strategy != null) {
            strategy.sort(array);
        } else {
            System.out.println("nessuna strategia di ordinamento selezionata");
        }
    }

    public int[] getArray() {
        return array;
    }
    

}
