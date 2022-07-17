package case_study.utils;

public class Validate {

    public boolean validateNameService(int numOfNameService){
        if(numOfNameService < 0 ){
            return true;
        }
        if(numOfNameService > 9999){
            return true;
        }
        return false;
    }

    public  String standardizedNameService(int numOfNameService){
        if(numOfNameService < 10){
            return "000"+Integer.toString(numOfNameService);
        }
        if(numOfNameService < 100){
            return "00" +Integer.toString(numOfNameService);
        }
        if(numOfNameService < 1000){
            return "0" +Integer.toString(numOfNameService);
        }
        return Integer.toString(numOfNameService);
    }

    public boolean checkPascalCaseString( String stringToCheck){
        char charToCheck[] = stringToCheck.trim().toCharArray();
        if(Character.isUpperCase(charToCheck[0])){
            return false;
        }
        return true;
    }

    public boolean areaPoolAndUse( double numberArea){
        if(numberArea < 30){
            return true;
        }
        return false;
    }

    public boolean rentalCostPostive( double rentalCost){
        if(rentalCost < 1){
            return true;
        }
        return false;
    }

    public boolean maximumPeolpe(int countPeople){
        if(countPeople < 0){
            return  true;
        }
        if(countPeople > 20){
            return  true;
        }
        return  false;
    }
}
