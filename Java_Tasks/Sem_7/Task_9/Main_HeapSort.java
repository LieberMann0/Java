package Sem_7.Task_9;

public class Main_HeapSort {
    
    public static void main(String args[]) {

        int[] arr = { 0, 13, -6, 6, 1, 80, -99, 8, -2, -23 };
        Sort.printArray(arr);

        Sort hs = new Sort();
        hs.sort(arr);
        
        Sort.printArray(arr);
    }
}
