/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kimbe
 */
public class ArrayGreaterThanN {

    public static void greaterThanN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 10, 3, 1, 14, 20};
        greaterThanN(array, 5);
        greaterThanN(array, 13);
        greaterThanN(array, 1);
    }
}
