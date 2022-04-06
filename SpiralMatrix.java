import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap kich thuoc ma tran: ");
            n = input.nextInt();
        } while (n < 3 || n > 8);

        int[][] arr = new int [n+1][n+1];
         
        int row = 0, column = n - 1;
        int k = 1;
        for (int i = 0; i <= n/2; i++) {
            for (int j = row; j <= column; j++) arr[row][j] = k++;
            for (int j = row + 1; j <= column; j++) arr[j][column] = k++;
            for (int j = column - 1; j >= row; j--) arr[column][j] = k++;
            for (int j = column - 1; j >= row + 1; j--) arr[j][row] = k++;
            row++;
            column--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        input.close();
    }
}
