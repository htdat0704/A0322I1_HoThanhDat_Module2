public class Test {

    public static int count_even_numbers (int n) {
        if(n ==0 ){
            return 0;
        }else{
            if(n%2 ==0){
                n--;
                return (1+count_even_numbers(n));
            }else{
                n--;
                return 0+count_even_numbers(n);
            }
        }
    }
    public static void main(String args[]) {

        System.out.println(count_even_numbers(5));

        




    }
}
