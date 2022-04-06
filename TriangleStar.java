import java.util.Scanner;
public class TriangleStar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int h;
        do {
            System.out.print("Nhap h: ");
            h = input.nextInt();
        } while (h < 2 || h > 10);

        int numSpace = h - 1;
        int numStar = 1;
        while (numSpace >= 0) {
            for (int i = 1; i <= numSpace; i++) System.out.print(" ");
            numSpace--;
            for (int i = 1; i <= numStar; i++) System.out.print("*");
            numStar += 2;
            System.out.println();
        }
        input.close();
    }
}
