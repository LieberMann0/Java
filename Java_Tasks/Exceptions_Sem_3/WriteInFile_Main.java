package Exceptions_Sem_3;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class WriteInFile_Mine {

    static String result = "";
    static String tmp = "";
    static String lastName = "";
    static String firstName = "";
    static String secondName = "";
    static String sex = "";
    static String phoneNumber = "";
    static String birthday = "";
    static SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
    static writeInFile wif = new writeInFile();

    static String getName() throws ParseException {
        System.out.print("Enter your full name, phone number, date of birth, sex (f, m): ");

        try (Scanner sc = new Scanner(System.in)) {
            tmp = sc.nextLine();
            String[] splitString = tmp.split(" ");
            String stringDate = splitString[4];

            try {
                Date date = formatter.parse(stringDate);
                System.out.println("Date of birth: " + date);
            } catch (ClassCastException e) {
                System.out.println("Enter date of birth correctly.");
                getName();
            } catch (ParseException e) {
                System.out.println("Enter the date in your place.");
                getName();
            }

            String lengchPhone = splitString[3];

            if (splitString.length < 6) {
                System.out.println("Enter all data please.");
            } else if (lengchPhone.length() < 11) {
                System.out.println("Enter phone number correctly please.");
            } else {
                lastName = splitString[0];
                firstName = splitString[1];
                secondName = splitString[2];
                phoneNumber = splitString[3];
                birthday = splitString[4];
                sex = splitString[5];
                result = String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, secondName, phoneNumber,
                        birthday, sex);
            }

        }
        return result;
    }

    public static void main(String[] args) throws ParseException {

        String temp = getName();
        System.out.println(temp);
        wif.writeInFile(temp);

    }
}