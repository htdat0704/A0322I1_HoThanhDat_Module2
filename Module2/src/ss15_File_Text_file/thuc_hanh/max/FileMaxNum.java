package ss15_File_Text_file.thuc_hanh.max;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileMaxNum {

    public void createFile(String path){
        try{
            File file = new File(path);
            if(file.createNewFile()){
                System.out.println("Create success" +path);
            }else{
                System.out.println("Alreay taken");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void writeFile(String path){
        try{
            FileWriter fileWriter = new FileWriter(path);
            for(int i  =0; i< 10; i++){
                fileWriter.write(""+Math.floor(Math.random()*100)+"\n");
            }
            fileWriter.close();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public void findMaxFile(String path){
        try{
            File file = new File(path);
            List<String> list = new ArrayList<>();

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = "";

            while ((line = br.readLine()) != null){
                System.out.println(line);
                list.add(line);
            }

            br.close();

            double max = Double.parseDouble(list.get(0));

            for (String str: list){
                if(max < Double.parseDouble(str)){
                    max = Double.parseDouble(str);
                }
            }

            System.out.println("Max "+ max);
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        FileMaxNum num = new FileMaxNum();
        String path = "src/ss15_File_Text_file/thuc_hanh/max/number.txt";
        num.createFile(path);
        num.writeFile(path);
        num.findMaxFile(path);
    }
}
