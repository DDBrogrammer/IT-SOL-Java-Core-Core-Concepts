package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        int n, kt = 1;
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
        int [] sorted_arr=sort(A);
        System.out.println("Sorted array: ");
        for(int i=0;i<=sorted_arr.length-1;i++){
            System.out.println(sorted_arr[i]);
        }
        System.out.println("Nhập số thêm vào mảng:");
        Integer number = scanner.nextInt();
        int B[]=new int [sorted_arr.length+1];
        B[sorted_arr.length]= number;
        for(int i=0;i<=A.length-1;i++){
            B[i]=A[i];
        }
        int [] sorted_B = sort(B);
        System.out.println("Mảng được săp xếp với số đươc thêm vào: ");
        for(int i=0;i<=sorted_B.length-1;i++){
            System.out.println(sorted_B[i]);
        }

    }
    public static  int[] sort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
