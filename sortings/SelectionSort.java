/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortings;

/**
 *
 * @author User
 */
public class SelectionSort {
    int[] numbers;

    public SelectionSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[min] > numbers[j]) {
                    min = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
    }

    public void print() {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}