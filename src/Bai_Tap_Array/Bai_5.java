package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số phần tử của mảng 1: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int A[] = new int[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng 1: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        do {
            System.out.println("Nhập số phần tử của mảng 2: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int B[] = new int[n];
        System.out.println("Nhập giá trị cho các phần tử của mảng 2: ");
        for (int i = 0; i < n; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = scanner.nextInt();
        }
        System.out.println("Nhập số X:");
        Integer number = scanner.nextInt();
        int mergeArray[] = mergeArray(A,B,number);
        for(int i=0;i<=mergeArray.length-1;i++){
            System.out.println(mergeArray[i]);
        }

    }

    public static int[] mergeArray(int[] a,int[] b, int position){
        int [] c= new int[a.length+b.length];
        System.out.println("c L:"+c.length);
        for(int i=0;i<=position-1;i++){
            c[i]=a[i];
        }
        for(int i=position,t=0; i<=position+b.length-1;i++){
            c[i]=b[t];
            t++;
        }
        for(int i=position+b.length;i<=c.length-1; i++ ){
            c[i]=a[position];
            position=position+1;
        }
        return c;
    }


}
