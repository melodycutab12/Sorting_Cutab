/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortings;

/**
 *
 * @author User
 */
public class MergeSort {
    int[] numbers;
    
     public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int[] aux, int low, int high) {
        if (low >= high) {
            return;
        }

      
        int mid = low + (high - low) / 2;

        
        sort(arr, aux, low, mid);
        sort(arr, aux, mid + 1, high);

      
        if (arr[mid] <= arr[mid + 1]) {
            return;
        }

        
        merge(arr, aux, low, mid, high);
    }

    private static void merge(int[] arr, int[] aux, int low, int mid, int high) {
        // Copy target section to auxiliary buffer
        for (int k = low; k <= high; k++) {
            aux[k] = arr[k];
        }

        int i = low;     
        int j = mid + 1;

        
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > high) {
                arr[k] = aux[i++];
            } else if (aux[i] <= aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }
}
    
    

