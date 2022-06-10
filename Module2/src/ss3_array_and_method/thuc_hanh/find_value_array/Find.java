package ss3_array_and_method.thuc_hanh.find_value_array;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna",
                "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        System.out.print("Nhập tên học sinh muốn kiếm tìm: ");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();

        boolean checkName = false;

        for (String value : students){
            if(value.equals(name)){
                System.out.printf("học sinh %s có nằm trong danh sách",name);
                checkName = true;
            }
        }

        if(checkName == false){
            System.out.printf("học sinh %s không có nằm trong danh sách",name);
        }

    }
}
