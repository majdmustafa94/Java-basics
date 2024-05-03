package Array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int myList[][] = new int[rows][columns];

        read(myList);
        print(myList);
        row1(myList);
        col1(myList);
        diagonal(myList);
        sumRow(myList);
        sumCol(myList);

    }

    public static void read(int arr[][]) {

        Scanner input = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter value: ");
                arr[row][col] = input.nextInt();
                print(arr);
            }
        System.out.println("");
    }

    public static void print(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public static void row1(int arr[][]) {
        for (int col = 0; col < arr.length; col++)
            System.out.print(arr[0][col]);
        System.out.println("");
    }

    public static void col1(int arr[][]) {
        for (int row = 0; row < arr.length; row++)
            System.out.print(arr[row][0]);
        System.out.println("");
    }

    public static void diagonal(int arr[][]) {
        for (int row = 0; row < arr.length; row++)
            System.out.print(arr[row][row]);
        System.out.println("");
    }

    public static void sumRow(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            System.out.println(" sumRow" + (row + 1) + "= " + sum);
        }
    }

    public static void sumCol(int arr[][]) {
        for (int col = 0; col < arr.length; col++) {
            int sum = 0;
            for (int row = 0; row < arr[col].length; row++) {
                sum = sum + arr[row][col];
            }
            System.out.println(" sumCol" + (col + 1) + "= " + sum);
        }
    }

}

