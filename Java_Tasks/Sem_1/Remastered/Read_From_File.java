package Remastered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Read_From_File {
    
    public static List<String> readInputData(){
        BufferedReader bRead = null;
        String a_Str = null;
        String b_Str = null;

        try {
            bRead = BufferedReader(new FileReader("input.txt"));
            b_Str = bRead.readLine();
            a_Str = bRead.readLine();        
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            bRead.close();
        }

        ArrayList<String> numList = new ArrayList<>();
        numList.add(0, b_Str);
        numList.add(1, a_Str);

        return numList;

    }
    
}
