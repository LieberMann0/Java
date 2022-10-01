package Exceptions_Sem_1;

public class Task_02 {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3"},{null, null, null}};    //NullPointerException
        System.out.println(sum2d(array));
    }
    
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {      //ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);      //NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}
