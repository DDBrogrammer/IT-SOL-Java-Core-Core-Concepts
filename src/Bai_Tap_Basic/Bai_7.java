package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        System.out.println(checkPrime(11));
    }

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
        System.out.println(result);
        return result;
    }


}
