import java.util.Scanner;

public class BTVN5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma tran thu 1: ");
        System.out.println("Nhap so hang:");
        int rows1 = scanner.nextInt();
        System.out.println("Nhap so cot:");
        int columns1 = scanner.nextInt();

        System.out.println("Nhap ma tran thu 2: ");
        System.out.println("Nhap so hang:");
        int rows2 = scanner.nextInt();
        System.out.println("Nhap so cot:");
        int columns2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];

        int[][] matrixSum = new int[matrix1.length][matrix1[0].length];


        System.out.println("Nhap gia tri ma tran thu 1: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhap gia tri ma tran thu 2: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        if (haveSameDimensions(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                }


            }System.out.println("Tong 2 ma tran la:");
            for (int[] row : matrixSum) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("nhap lai");
        }
    }

    private static boolean haveSameDimensions(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }
}