package ss10_stackuseLinkedlist.bai_tap.Demerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Personnel personnel[] = new Personnel[9];
        personnel[0] = new Personnel("A van B",true,"12/12/1999");
        personnel[1] = new Personnel("B Van C",false,"12/12/1999");
        personnel[2] = new Personnel("D Van F",true,"12/12/1999");
        personnel[3] = new Personnel("E Van F",true,"12/12/1999");
        personnel[4] = new Personnel("G Van X",true,"12/12/1999");
        personnel[5] = new Personnel("G Van H",false,"12/12/1999");
        personnel[6] = new Personnel("K van L",false,"12/12/1999");
        personnel[7] = new Personnel("O van I",false,"12/12/1999");
        personnel[8] = new Personnel("U van L",true,"12/12/1999");

        Queue<Personnel> NAM = new LinkedList<>();
        Queue<Personnel> NU = new LinkedList<>();
        System.out.println("Before sort: ");
        for(Personnel personnelValue: personnel){
            System.out.println(personnelValue.toString());
            if (personnelValue.isGioiTinh()){
                NAM.add(personnelValue);
            }else{
                NU.add(personnelValue);
            }
        }

        String ouput = "";

        while (!NU.isEmpty()){
            ouput += NU.poll().toString() +"\n";
        }

        while (!NAM.isEmpty()){
            ouput += NAM.poll().toString()+"\n";
        }

        System.out.println("After sort: ");
        System.out.println(ouput);
    }
}
