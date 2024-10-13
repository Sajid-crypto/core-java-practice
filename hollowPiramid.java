import java.util.*; 
public class hollowPiramid {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to adjust the height of the pyramid

        for (int i = 0; i <= 5; i++) {
            // Print spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}
