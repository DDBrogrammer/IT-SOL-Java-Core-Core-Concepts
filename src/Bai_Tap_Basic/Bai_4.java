package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên a:");
        Integer a = myObj.nextInt();
        System.out.println("Nhập số tự nhiên b:");
        Integer b= myObj.nextInt();
        findPair(a,b);

    }

    public static boolean checkPrime(int num){
        if(getGCD(num)==1){
            return true;
        }else return false;
    }

    public static void findPair(int a, int b){
        if(a-b>0){
            for(int i=b;i<=a;i++){
                  if(checkPrime(i)){
                      for(int t=a;t>=i;t--){
                          if(checkPrime(t)){
                              System.out.print(i+" "+t);
                          }
                      }
                  }

            }
        }else {
            for(int i=a;i<=b;i++){
                if(checkPrime(i)){
                    for(int t=b;t>=i;t--){
                        if(checkPrime(t)){
                            System.out.print(i+" "+t);
                        }
                    }
                }

            }

        }
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
