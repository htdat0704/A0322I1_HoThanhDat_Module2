package ss8_cleancode.thuc_hanh.variable;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isBuzz = number % 3 == 0;
        boolean isFizz = number % 5 == 0;
        if(isBuzz && isFizz)
            return "FizzBuzz";

        if(isBuzz)
            return "Fizz";

        if(isFizz)
            return "Buzz";

        return number + "";
    }
}
