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

        int countList[];
        countList=getCountList(A);
        for(int i=0;i<countList.length-1;i++){
            System.out.println(countList[i]);
        }
        for (int i=0;i<countList.length-1;i++){
            if(i%2==0){
                System.out.println("Number: "+countList[i]);

            }else System.out.println("Total: "+ countList[i]);        }
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

    public static  int countDifferentElement(int[] arr ){
        int sorted_arr[]= sort(arr);
        int count = 1;
      for(int i=0;i<=arr.length-2; i++){
          if(sorted_arr[i]!=sorted_arr[i+1]){
              count=count+1;
          }
      }
      return count;
    }
    public static int[] getCountList(int[] arr ){
        int sorted_arr[]= sort(arr);
        int count = 1;
        int [] count_list_number= new int[countDifferentElement(sorted_arr)*2];
        int index=0;
        for( int i=0;i< arr.length-2;i++){
            if(sorted_arr[i]==sorted_arr[i+1]){
                System.out.println("run count");
                count=count+1;
            }else if(sorted_arr[i]!=sorted_arr[i+1] ){
                System.out.println("run add");
                count_list_number[index]=sorted_arr[i];
                index=index+1;
                count_list_number[index]=count;
                count=1;
                index=index+1;

            }
        }
        return count_list_number;
    }

}
