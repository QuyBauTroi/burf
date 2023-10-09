
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhap ma tran thu 1: ");
        int input[] = ColumnRow();
        int columnFirst = input[1], rowFirst = input[0];
        double[][] arrMatrix1 = new double[columnFirst][rowFirst];
        matrixInput(arrMatrix1, columnFirst, rowFirst);
        System.out.println("Nhap ma tran thu 2: ");
        int input2[] = ColumnRow();
        int columnSecond = input2[1], rowSecond = input2[0];
        double[][] arrMatrix2 = new double[columnSecond][rowSecond];
        matrixInput(arrMatrix2, columnSecond, rowSecond);
        matrixPlus(arrMatrix1, arrMatrix2, columnFirst, rowFirst, columnSecond, rowSecond);

    }

    public static int[] ColumnRow() {
        int input[] = new int[2];
        System.out.print("Nhập số hàng của ma trận: ");
        input[0] = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập số cột của ma trận: ");
        input[1] = Integer.parseInt(scan.nextLine());
        return input;
    }

    public static void matrixPrint(double[][] arr, int column, int row) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println("");
        }
    }

    public static double[][] matrixInput(double[][] arr, int column, int row) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Nhap phan tu ma tran thu [" + (i + 1) + "][" + (j + 1) + "] :");
                arr[i][j] = Double.parseDouble(scan.nextLine());
            }
        }
        return arr;
    }

    public static void matrixPlus(double[][] arr, double[][] arr2, int column, int row, int column2, int row2) {
        double[][] arrSum = new double[column][row];
        if (column == column2 && row == row2) {
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    arrSum[i][j] = arr[i][j] + arr2[i][j];
                }
            }
            System.out.printf("Tổng 2 ma trận vừa nhập là: ");
            matrixPrint(arrSum, column, row);
        } else {
            System.out.println("Hàng và cột 2 ma trận không bằng nhau, nhập lại");
        }

    }
}