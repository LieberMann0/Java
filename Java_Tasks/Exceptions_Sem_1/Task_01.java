package Exceptions_Sem_1;

import java.util.Arrays;

public class Task_01 {

    public static int method_1(int a, int b) {
        return a/b;
        // ArithmeticException
    }

    public static int[] method_2(int a, int b, int c) {  
        int[] array = new int[a];
        array[b] = c;
        return array;
        // ArrayIndexOutOfBoundsException
    }

    public static int method_3() {
        String temp = null;
        return temp.length();
        // NullPointerException
    }
    public static void main(String[] args) {        

        System.out.println(method_1(10, 0));
        System.out.println(Arrays.toString(method_2(10, 20 , 2)));
        System.out.println(method_3());
    }
}
