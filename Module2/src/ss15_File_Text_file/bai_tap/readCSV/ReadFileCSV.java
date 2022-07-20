package ss15_File_Text_file.bai_tap.readCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileCSV {

    public static List<Country> listCountry = new LinkedList<>();

    public static void readCSV(String path){
        try{

            File fileSource = new File(path);
            System.out.println(1);
            if(!fileSource.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line = "";

            while ((line = bufferedReader.readLine()) != null){
                String arr[] = line.split(",");
                listCountry.add(new Country(Integer.parseInt(arr[0]),arr[1],arr[2]));
            }

        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        readCSV("src/ss15_File_Text_file/bai_tap/readCSV/file.csv");
        for(Country country: listCountry){
            System.out.println(country);
        }
    }
}
