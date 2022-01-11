package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên:");
        Integer number = myObj.nextInt();
        System.out.println("tong so uoc la: "+ getDivisorList(number));

    }
    public static int  getDivisorList( int number){
        int sum=0;
        for(int i=1;i<=number;i++){
            if(number% i==0){
                sum++;
            }
        }
        return sum;
    }
}
