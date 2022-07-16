package Sem_7.Task_6;

import java.util.Arrays;

public class Sort {


    public static int[] mergeSort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergeSortInn(buffer1, buffer2, 0, array1.length);
        return result;
    }


    public static int[] mergeSortInn(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }        
        
        int middle = startIndex + (endIndex - startIndex) / 2;
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] sorted1 = mergeSortInn(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInn(buffer1, buffer2, middle, endIndex);
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }

        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }

        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }

        return result;
    }
    
}
