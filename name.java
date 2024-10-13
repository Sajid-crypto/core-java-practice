import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your gender (m/f)");
        String gender = sc.nextLine().toLowerCase();

        if (gender.equals("m")) {
            System.out.println("This is a boy");
        } else if (gender.equals("f")) {
            System.out.println("This is a girl");
        } else {
            System.out.println("Invalid");
        }
    }
}