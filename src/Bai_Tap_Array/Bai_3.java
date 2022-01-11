package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_3 {
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
        countElement(A);
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
    
    public static  void countElement(int[] arr){
      int[] sorted_arr=sort(arr);
      int count=1;
      int max=1;
      int numMax=1;
      if(arr.length==1){
          System.out.println("Số xuất hiện nhiều nhất là: "+arr[0]+" (1 lần)");
      }else{
          for(int i = 0;i<=sorted_arr.length-2;i++){
              if(sorted_arr[i]==sorted_arr[i+1]){
                  count=count+1;
                  if(i+1==arr.length-1){
                      System.out.println("số "+sorted_arr[i+1]+" xuất hiện "+count +" lần");
                      if(count>max){
                          max=count;
                          numMax=sorted_arr[i+1];
                      }
                  }
              }else if(sorted_arr[i]!=sorted_arr[i+1]){
                  System.out.println("số "+sorted_arr[i]+" xuất hiện "+count+" lần");
                  if(i+1==arr.length-1){
                      System.out.println("số "+sorted_arr[i+1]+" xuất hiện 1 lần");
                  }
                  if(count>max){
                      max=count;
                      numMax=sorted_arr[i];
                  }
                  count=1;
              }
          }
          System.out.println("Số xuất hiện nhiều nhất là: "+numMax+" ("+max+" lần)");
      }


    }

}
