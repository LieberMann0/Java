package Sem_7.Task_6;

import java.util.Arrays;


public class Main_MergeSort {
    public static void main(String[] args) {
        int[] arr = { 0, 13, -6, 6, 1, 80, -99, 8, -2, -23 };
        int[] result = Sort.mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }
}