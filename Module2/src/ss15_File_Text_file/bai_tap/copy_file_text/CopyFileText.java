package ss15_File_Text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {

    public void CopyFile(String source, String target){

        try{
            File fileSource = new File(source);
            File fileTarget = new File(target);

            if(!fileSource.exists()){
                throw  new FileNotFoundException();
            }

            if(fileTarget.createNewFile()){
                System.out.println("File created "+target);
            }else {
                System.out.println("File already "+target);
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            FileWriter fileWriter = new FileWriter(target);

            String line = "";

            while ((line = bufferedReader.readLine()) != null){
                fileWriter.write(line+"\n");
            }

            bufferedReader.close();
            fileWriter.close();


        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        String source = "src/ss15_File_Text_file/thuc_hanh/max/number.txt";
        String target = "src/ss15_File_Text_file/bai_tap/copy_file_text/number.txt";
        copyFileText.CopyFile(source,target);
    }

}
