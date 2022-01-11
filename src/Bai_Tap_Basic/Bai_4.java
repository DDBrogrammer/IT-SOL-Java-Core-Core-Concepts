package Bai_Tap_Basic;

import java.util.Scanner;
// error
public class Bai_4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a,b;
        do {

            System.out.println("Nhập số tự nhiên a:");
             a = myObj.nextInt();
            System.out.println("Nhập số tự nhiên b:");
             b = myObj.nextInt();
             if(a>b){
                 System.out.println("a phải bé hơn b");
             }else{
                 break;
             }
        }
        while(true);

        for(int i=a;a<=b;i++){
            for(int j=i+1;j<=b;j++){
                if(getGCD(i,j)==1){
                    System.out.println("Cặp số nguyên: "+i+ " và "+j);
                }
            }
        }


    }

    public static boolean checkPrime(int num){
        if(getGCD(num)==1){
            return true;
        }else return false;
    }

    public static void findPair(int a, int b){

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
    public static int getGCD(int a, int b){
        int sum=0;
        if(a-b>0){
            for(int i=1;i<=a;i++){
                if(a % i==0 && b% i==0){
                    sum=i;
                }
            }
        }else {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    sum = i;
                }
            }
        }
        return sum;
    }
}
