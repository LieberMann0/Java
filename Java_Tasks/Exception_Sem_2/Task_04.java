package Exception_Sem_2;

import java.util.Scanner;

public class Task_04 {

    public static String getString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String text = iScanner.nextLine();
        iScanner.close();
        return text;
    }

    public static void main(String[] args) {
        String result = getString();
        if (result == "") {
            System.out.printf("String can't be empty ");
        } else {
            System.out.printf("Your string is %s !", result);
        }
    }    
}
