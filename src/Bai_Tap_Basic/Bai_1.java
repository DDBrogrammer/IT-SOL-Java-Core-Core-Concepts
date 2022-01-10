package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_1 {

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Nhập số tự nhiên:");
            Integer number = myObj.nextInt();
            System.out.println("A: "+getSum(number));
            System.out.println("B:"+ getFloatSum(number));
        }
        public static int getSum(int number){
            int sum = 0;
            for(int i = 0;i<=number;i++){
                if(number%2==0 && i%2==1){
                 sum=sum+i;
                }
                else if(
                        number%2==1 && i %2==1
                ){
                    sum=sum+i;
                }
            }
          return sum;
        }

        public static float getFloatSum(int number){
            float sum= 1.0f;
            for(int i = 1; i<=number;i++){
                sum=sum+ 1/i;
            }
            return sum;
        }
}
