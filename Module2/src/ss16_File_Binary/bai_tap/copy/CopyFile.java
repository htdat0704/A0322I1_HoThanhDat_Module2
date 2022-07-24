package ss16_File_Binary.bai_tap.copy;

import java.io.*;
import java.util.Scanner;

public class CopyFile {

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sourcePath = "src/ss16_File_Binary/bai_tap/copy/test.jpg";
        String destPath = "src/ss16_File_Binary/bai_tap/copy/testResult.jpg";


        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
