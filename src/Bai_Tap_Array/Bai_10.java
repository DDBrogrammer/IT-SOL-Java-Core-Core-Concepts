package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_10 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào bậc của ma trận: ");
            n = scanner.nextInt();
        } while (n < 0);

        int[][] A = new int[n][n];
        System.out.println("Nhập vào các phần tử của ma trận A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận ban đầu: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int main_sum=0;
        for(int i=0;i<=n-1;i++){
            main_sum=main_sum+A[i][i];
        }

        System.out.println("Tổng đường chéo chính: "+main_sum);
        int sub_sum=0;
        int u=n-1;
        for(int i=0;i<=n-1;i++){
            sub_sum=sub_sum+A[i][u];
            u=u-1;
        }

        System.out.println("Tổng đường chéo phụ: "+sub_sum);
    }
}
