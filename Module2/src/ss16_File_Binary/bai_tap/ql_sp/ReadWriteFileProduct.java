package ss16_File_Binary.bai_tap.ql_sp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileProduct {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mát", "Máy quạt","Toshiba",123));
        products.add(new Product(1, "Mát Lạnh", "Máy quạt lạnh","Sonic",123));
        products.add(new Product(1, "Tivi ", "TV","LG",123));
        products.add(new Product(1, "bỏ đổ làm lạnh", "Tủ lạnh","Toshiba",123));
        products.add(new Product(1, "Mouse", "Chuột","DAREU",123));
        String path  = "src/ss16_File_Binary/bai_tap/ql_sp/product.txt";
        writeToFile(path, products);
        List<Product> studentDataFromFile = readDataFromFile(path);
        for (Product product : studentDataFromFile){
            System.out.println(product);
        }
    }
}
