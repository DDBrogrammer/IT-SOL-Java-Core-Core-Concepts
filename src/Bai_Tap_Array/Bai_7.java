package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_7 {
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

        System.out.println("Độ dài: "+findLongRun(A)[0]);
        System.out.println("Vị trí"+ findLongRun(A)[1]);
    }
    public static int[] findLongRun(int[] arr){
        int count = 1;
        int index = 0;
        int temRun=0;
        int[] index_and_range = new int[2];
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i]<=arr[i+1]){
                count=count+1;
            }else{
                if(temRun<=count){
                temRun=count;
                count=1;
                index_and_range[1]=i-temRun;
            } }
        }
        index_and_range[0]=temRun;
      return index_and_range;
    }









}
