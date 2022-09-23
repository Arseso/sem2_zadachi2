import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class z3 {


    private static String FILE_INPUT_NAME = "src/z3_in.txt";
    private static String FILE_OUTPUT_NAME = "src/z3_out.txt";

    public static void main(String[] args) {
        ArrayList<String> arr = input(FILE_INPUT_NAME);
        if(arr==null) return;
        arr = sort_list(arr);
        System.out.println(arr);
        file_write(arr);
    }

    private static void file_write(ArrayList<String> arr) {
        try(FileWriter writer = new FileWriter(FILE_OUTPUT_NAME, false))
        {
            for(int i = 0; i< arr.size(); i++) writer.write(arr.get(i)+'\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    private static ArrayList<String> sort_list(ArrayList<String> arr) {
        for(int i=1; i<arr.size(); i++){
            for(int g=1; g<arr.size();g++)
                if(kol_a(arr, g) > kol_a(arr,g-1))
                    Collections.swap(arr, g-1, g);
        }
    return arr;
    }

    private static int kol_a(ArrayList<String> arr, int g) {
        int kol = 0;
        for(int k=0; k < arr.get(g).length();k++) if(arr.get(g).charAt(k)=='а') kol++;
        return kol;
    }

    private static ArrayList<String> input(String fileInputName) {
        ArrayList<String> input_list = new ArrayList<String>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileInputName)))
        {

            String s;
            while((s = reader.readLine())!=null){
                input_list.add(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
            System.out.println("Error.");
            return null;
        }
    return input_list;
    }
}
