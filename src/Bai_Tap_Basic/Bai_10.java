package Bai_Tap_Basic;

public class Bai_10 {

    public static boolean checkPrime(int number){
        if(getGCD(number)==1){
            return true;
        }else return false;
    }
    public static int getGCD(int num){
        int result=0;
        for(int i=1;num>i;i++){
            if(num % i ==0 ){
                result=i;
            }
        }
        return result;
    }

}
