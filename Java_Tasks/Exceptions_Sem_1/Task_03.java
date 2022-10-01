package Exceptions_Sem_1;

public class Task_03 {
    
    static int[] array1 = new int[] { 1, 2, 3, 4, 5, 6 };
    static int[] array2 = new int[] { 0, 1, 2, 3, 4, 5 };

    static int[] differenceArrays(int[] array1, int[] array2) {
        int[] result = new int[6];
        for (int index = 0; index < array1.length; index++) {
            result[index] = array1[index] - array2[index];
        }

        return result;
    }

    static String printArray(int[] array) {
        String result = "";

        for (int index = 0; index < array.length; index++) {
            result += (array[index] + " ");
        }

        return result;
    }

    static int testExceptions(int[] array1, int[] array2) {
        int tmp1 = array1.length;
        int tmp2 = array2.length;

        if (tmp1 != tmp2)
            return -1;

        return 1;
    }

    public static void main(String[] args) {

        int[] temp = differenceArrays(array1, array2);

        switch (testExceptions(array1, array2)) {
            case -1:
                System.out.println("Array lengths are not equal");
                break;

            default:
                System.out.println("New Array " + "{"+(printArray(temp))+"}");
                break;
        }

    }
}
