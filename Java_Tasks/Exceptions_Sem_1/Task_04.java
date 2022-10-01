package Exceptions_Sem_1;

public class Task_04 {
    

    static int[] divArrays(int[] array1, int[] array2) {
        int[] result = new int[6];
        for (int index = 0; index < array1.length; index++) {
            result[index] = array1[index] / array2[index];
        }
        return result;
    }


    static String printArray(float[] array) {
        String result = "";
        for (int index = 0; index < array.length; index++) {
            result += (array[index] + "  ");
        }
        return result;
    }


    static void testExceptions(int[] array1, int[] array2) {
        int tmp1 = array1.length;
        int tmp2 = array2.length;
        int temp = 0;
        for (int index = 0; index < array2.length; index++) {
            temp = array2[index];
            if ((temp == 0) || (tmp1 != tmp2)){
                throw new RuntimeException();
            }                
        }
    }
    
    public static void main(String[] args) {

        int[] array1 = { 12, 11, 10, 9, 8, 7 };
        int[] array2 = { 6, 5, 4, 3, 2, 1 };
    
        testExceptions(array1, array2);
        System.out.println(printArray(divArrays(array1, array2)));        

    }
    
}
