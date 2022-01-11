package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
       for(int i=100000;i<=999999;i++){
           if(checkAllNumberOdd(i) && checkPrime(i)){
               System.out.println(i);
           }
       }
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
        return result;
    }

    public static boolean checkAllNumberOdd(int number){
        boolean check=true;
        int com;
        while (number > 0) {
            com = number % 10;
            number = number / 10;
            if(com%2==0){
                check=false;
            }
        }
        return check;
    }
}
