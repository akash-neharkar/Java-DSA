package BasicCodes;
import java.util.*;

public class IdenticalMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = in.nextInt();


        int[][] matrixA = new int[rows][cols];
        System.out.println("Enter the elements of Matrix1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = in.nextInt();
            }
        }

        int[][] matrixB = new int[rows][cols];
        System.out.println("Enter the elements of Matrix2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = in.nextInt();
            }
        }

        boolean areIdentical = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    areIdentical = false;
                    break;
                }
            }
            if (!areIdentical) {
                break;
            }
        }

        if (areIdentical) {
            System.out.println("Matrices are Identical!");
        }
        else {
            System.out.println("Matrices are not identical");
        }
    }
}

