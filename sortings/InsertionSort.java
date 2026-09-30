/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortings;

/**
 *
 * @author User
 */
public class InsertionSort {
    int[] numbers;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    public void sort() {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;

            System.out.println("Pass " + i + " - Temp: " + temp);

            while (j >= 0 && numbers[j] > temp) {
                System.out.printf("Comparing %d and %d -> shifting %d%n", numbers[j], temp, numbers[j]);
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = temp; 

            System.out.print("Array state: ");
            display();
            System.out.println();
        }
    }

    public void display() {
        for (int number : this.numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}