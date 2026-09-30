/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortings;

/**
 *
 * @author User
 */
public class BubbleSort {
    int[] numbers;
    
    public BubbleSort(int[] numbers){
        this.numbers = numbers;
    }
    
    public void swap(int index) {
        int left = numbers[index];
        numbers[index] = numbers[index + 1];
        numbers[index + 1] = left;
    } 
    
    public void print(){
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void sort(){
        for (int i = 0; i < numbers.length - 1; i++ ){
            System.out.println("Iteration " + (i + 1) + ":");
            
            for (int index = 0; index < numbers.length - 1 - i; index++){
                if (numbers[index] > numbers[index + 1]){
                    swap(index);
                }
            }
            System.out.print("Array Status : ");
            print();
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[] sampleData = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original Array: ");
        for (int num : sampleData){
            System.out.print(num + " ");
        }
        
        System.out.println("\n----------------------");
        
        BubbleSort sorter = new BubbleSort(sampleData);
        sorter.sort();
        
        System.out.print("Final Sorted Array: ");
        sorter.print();
    }
}
