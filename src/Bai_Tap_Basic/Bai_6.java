package Bai_Tap_Basic;

import java.util.Scanner;

public class Bai_6 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhập số tự nhiên:");
        Integer a = myObj.nextInt();
        getNumberList(a);
    }

    public static void getNumberList(int num ){
        int i=2;
        int[] list= new int[getTotalCount(num)];
        int u=0;
        while (num>1){
           if(num%i==0){
               num=num/i;
               list[u]=i;
               u++;
           }else{i++;}
       }
    }
    public static int getTotalCount( int num){
        int i=2,total=0;
        boolean check=true;
        while (num>1){
            if(num%i==0){
                int first=num;
                num=num/i;
                total=total+1;
                if(check){
                    System.out.print(first+" = "+i);
                    check=false;
                }
                else{
                    System.out.print(" * "+i);
                }
            }else{i++;};
        }
        return total;
    }
}
