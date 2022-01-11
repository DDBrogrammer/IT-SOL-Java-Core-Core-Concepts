package Bai_Tap_Array;

import java.util.Scanner;

public class Bai_12 {
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
        int[][] res = new int[n][n];
        for(int i = n - 1; i >= 0; i--){
            for (int j = 0; j < n; j++){
                res[n - i - 1][j] = A[j][i];
            }
        }
        System.out.println("Ma trận đảo ngược:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

}
