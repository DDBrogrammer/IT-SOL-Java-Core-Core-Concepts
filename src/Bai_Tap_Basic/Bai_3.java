package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên a:");
        Integer a = myObj.nextInt();
        System.out.println("Nhập số tự nhiên a:");
        Integer b= myObj.nextInt();
        System.out.println("uoc so chung lon nhat: "+getGCD(a,b));
        System.out.println("boi so chung nho nhat: "+getLCM(a,b));
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

    public static int getLCM(int a, int b) {
        int sum = 0;
        for(int i=1;i<=a*b;i++){
            if(i%a==0 && i% b==0){
                sum = i;
                break;
            }
        }
        return sum;
    }

}