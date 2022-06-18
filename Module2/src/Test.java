public class Test {
    public static boolean isPalindrome (String str) {
        int count = 0;
        for(int i =0; i< str.length()/2; i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                count ++;
            }
        }
        if(count == str.length()/2){
            return true;
        }else{
            return false;
        }
    }

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
        System.out.println(isPalindrome("abba"));
        String s = "23";
        System.out.println(s.charAt(1));

        System.out.println(count_even_numbers(5));

        




    }
}
