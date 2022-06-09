package ss2_loop_java.bai_tap.hien_thi_so_nguyen_to_nho_hon_100;

public class ShowNumber {
    public static void main(String[] args) {

        int n,number=2,counter;

        while (number< 101){
            counter = 1;
            for(n=2 ; n < number ; n ++){
                if(number%n==0){
                    counter++;
                }
            }
            if(counter == 1){
                System.out.print(number +" ");
            }

            number++;
        }
    }
}
