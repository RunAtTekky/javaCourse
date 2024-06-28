import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        boolean prime = true;
        for (int i=2; i<x; i++) {
            if (x%i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is NOT prime");
        }
    }
}
