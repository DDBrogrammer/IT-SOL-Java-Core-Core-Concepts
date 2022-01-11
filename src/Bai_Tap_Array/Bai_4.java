package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhập số X:");
        Integer number = scanner.nextInt();
        System.out.println(getPrime(A,number));

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
    public static int getPrime(int[] arr,int X){
        int closetNum=0,a=0,b=0;
        boolean checkOne=false;
        for (int i=0;i< arr.length;i++){
            if(checkPrime(arr[i]) && checkOne==false){
                closetNum= arr[i];
                checkOne=true;
            }else if(
                    checkPrime(arr[i]) && checkOne==true
            ){
                a=arr[i];
            }
            closetNum=getCloseNum(a,b,X);
        }
        return closetNum;
    }
    public static int getCloseNum(int old_num, int new_num,int X ){
        if(Math.abs(X-old_num) >Math.abs(X-new_num)){
            return new_num;
        }else return old_num;
    }
}
