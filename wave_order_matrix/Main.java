package wave_order_matrix;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of rowsof the matrix  : ");

        int n = scn.nextInt();
        System.out.print("Enter the number of columns of the matrix : ");

        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        // input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        for (int j = 0; j < mat[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < mat.length; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = mat.length - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}