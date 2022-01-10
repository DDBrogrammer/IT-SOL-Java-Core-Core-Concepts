package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên:");
        Integer a = myObj.nextInt();
        System.out.println(getSum(a));
    }
    public static int getSum(int a){
        Integer sum=0, r;
        while (a > 0) {
            r = a % 10;
            a = a / 10;
            sum += r;
        }
        return sum;
    }
}
