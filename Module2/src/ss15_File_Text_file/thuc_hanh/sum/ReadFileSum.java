package ss15_File_Text_file.thuc_hanh.sum;

import java.io.*;

public class ReadFileSum {

    public void readFileText(String filepath){
        try{
            File file = new File(filepath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;

            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }

            br.close();

            System.out.println("Tổng = "+sum);
        }catch (Exception e){
            System.out.println("File không tồn tại hoặc là file có lỗi");
        }
    }

    public void createFile(String filepath){
        try {
            File file = new File(filepath);
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(String filepath){

        try {
            FileWriter fileWriter = new FileWriter(filepath);
            fileWriter.write("5\n");
            fileWriter.write("5");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String path = "src/ss15_File_Text_file/thuc_hanh/sum/filename.txt";
        ReadFileSum readfileEx = new ReadFileSum();
        readfileEx.createFile(path);
        readfileEx.writeFile(path);
        readfileEx.readFileText(path);
    }
}
