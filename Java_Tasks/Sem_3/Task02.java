package Sem_3;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        int d;
        String[] minComand = new String[0];        
        
        System.out.println(Arrays.toString(comandSet(a, b, c, d, "", minComand)));
    }


    public static Object comandSet(int a, int b, int c, int d,
                                String comandList, String[] minComandArray) {
        if (a > b) {
            return;
        }
        if (a == b) {
            //System.out.println(comandList);            
            String[] comandArray = comandList.split(" ");
            if (minComandArray.length == 1) {
                minComandArray = comandArray;
            }
            else {
                if (minComandArray.length > comandArray.length) {
                    minComandArray = comandArray;
                }

            }
            return;

        }
        comandSet(a + d, b, c, d, comandList + "com1 ", minComandArray);
        comandSet(a * c, b, c, d, comandList + "com2 ", minComandArray);

    }
    
}
