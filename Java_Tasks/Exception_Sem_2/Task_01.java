package Exception_Sem_2;

import java.util.Scanner;

public class Task_01 {

    public static String inputNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        String num = scanner.nextLine();
        while (!isFloat(num)){
            System.out.println("Not a number, input again: ");
            num = scanner.nextLine();
        }
        return num;
    }

    public static boolean isFloat(String str){
        return str.matches("^[0-9]*[.,]?[0-9]+$");
    }

    public static void main(String[] args) {
        String result = inputNum();
        System.out.println(result);
    }    
}
