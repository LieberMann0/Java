package Exceptions_Sem_2;

public class Task_02 {
    public static void main(String[] args) {        
        int[] intArray = {20, 3, 55, 34, 53, 589, 445, 45, 831}; //{20, 3, 55, 34, 53}; {20, 3, 55, 34, 53, 589, 445, 45, null}
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Catching exception: " + e1);
        }catch (ArithmeticException e2) {
            System.out.println("Catching exception: " + e2);
        }catch (NullPointerException e3) {
            System.out.println("Catching exception: " + e3);
        }
    }
}
