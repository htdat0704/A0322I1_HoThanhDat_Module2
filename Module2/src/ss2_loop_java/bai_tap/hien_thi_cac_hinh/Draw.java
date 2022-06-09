package ss2_loop_java.bai_tap.hien_thi_cac_hinh;

public class Draw {
    public static void main(String[] args) {
        int i, j ;
        for(i = 0; i< 3; i ++ ){
            System.out.println();
            for(j=0; j<7; j++){
                System.out.print("* ");
            }
        }
        System.out.println();
        for(i=1; i<=5; i++){
            for(j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(i=1; i<=5; i++){
            for(j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1; i<=5; i++){
            for(j=5; j>i; j--){
                System.out.print(" ");
            }
            for(j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(i=1; i<=5; i++){
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            for(j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        for(i=0; i<=5; i++){
            for(j=5; j>i; j--){
                System.out.print(" ");
            }
            for(j=0; j<(2*i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
