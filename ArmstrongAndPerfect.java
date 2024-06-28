import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongAndPerfect {
    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");

        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // Armstrong Number -> sum of cube of digits == number
        // Perfect Number -> sum of proper divisors == number

        boolean isArmstrong = isArmstrong(x);

        if (isArmstrong) {
            System.out.println(x + " is armstrong");
        } else {
            System.out.println(x + " is NOT armstrong");
        }

        boolean isPerfect = isPerfect(x);

        if (isPerfect) {
            System.out.println(x + " is perfect");
        } else {
            System.out.println(x + " is NOT perfect");
        }
    }

    static boolean isArmstrong(int x) {
        int sum = 0;
        int ogX = x;
        while (x > 0) {
            int digit = x%10;
            sum += digit*digit*digit;

            x /= 10;
        }
        return sum==ogX;
    }

    static boolean isPerfect(int x) {
        ArrayList<Integer> divisors = getDivisors(x);

        int sum = 0;
        for (int i=0; i<divisors.size(); i++) {
            sum += divisors.get(i);
        }
        return sum==x;
    }

    static ArrayList<Integer> getDivisors(int x) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i=1; i<x; i++) {
            if (x%i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }
}
