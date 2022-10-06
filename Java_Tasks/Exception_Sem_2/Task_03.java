package Exception_Sem_2;

public class Task_03 {
    public static void main(String[] args) {

        int a = 90;
        int b = 3;
        System.out.println(a / b);

        printSum(23, 234);

        int[] abc = { 1, 2 };
        int index = 3;

        if (index < abc.length) {
            abc[index] = 9;
        }
        else throw new ArrayIndexOutOfBoundsException ("Массив выходит за пределы своего размера!");
    }   
    public static void printSum(int a, int b){
        System.out.println(a + b);
    }

}

