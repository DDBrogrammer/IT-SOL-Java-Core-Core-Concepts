package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_1 {
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
        if (checkSymmetry(A)){
            System.out.println("Mảng đối xứng ");
        }else{
            System.out.println("Mảng ko đối xứng");
        }
    }

    public static boolean checkSymmetry(int []arr){
        boolean check=false;
       for(int i=0;i<=arr.length-1;i++){
           if(arr[i] ==arr[arr.length-i-1]){
               check=true;}
       }
       return check;
    }
}
