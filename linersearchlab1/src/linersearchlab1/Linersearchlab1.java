/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linersearchlab1;

/**
 *
 * @author khyle
 */
public class Linersearchlab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int size = 1000000000;
        int[] Array = new int[1000000000];
         for (int i = 0; i < 1000000000; i++) {
            Array[i] = i;
            
              int target = 1;

      
        int index = linearSearch(Array, target);

         if (index != -1) {
            System.out.println("Value " + target + " found at index: " + index);
        } else {
            System.out.println("Value " + target + " not found in the array.");
        }
    }
    }

    private static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
