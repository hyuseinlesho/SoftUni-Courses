package Exersise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <= N ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            totalPrice = totalPrice + orderPrice;
            orderPrice = 0;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
