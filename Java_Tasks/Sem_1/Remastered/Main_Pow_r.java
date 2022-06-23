package Remastered;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main_Pow_r {
    public static void main(String[] args) throws Exception {
        Read_From_File readInput = new Read_From_File();
        List<String> numList = readInput.readInputData();

        String value_b = numList.get(0);
        int b = Integer.parseInt(value_b);
        
        String value_a = numList.get(1);
        int a = Integer.parseInt(value_a);


        try (FileWriter fileWriter = new FileWriter("output.txt")){
            if (a == 0 && b == 0) {
                System.out.printf("a = %d, b = %d, There is no solution", a, b);
                fileWriter.write("There is no solution");
                fileWriter.close();
            }   
            else {
                System.out.printf("a = %d, b = %d, Result - %f", a, b, Math.pow(a, b));
                fileWriter.write((int) Math.pow(a, b));
                fileWriter.close();
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
