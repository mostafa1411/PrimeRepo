package Projects;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static boolean isPrime(int number) {
        if (number == 2)
            return true;
        if ((number & 1) == 0 || number == 1)
            return false;
        for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Number " + number + " is " + (isPrime(number) ? "" : "not ") + "prime");
    }
}
