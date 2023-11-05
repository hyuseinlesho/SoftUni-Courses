package MoreComplexChecks_Lecture;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        boolean workingDays = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday");
        boolean restDays = dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");

        double price = 0;

        if (workingDays) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                System.out.println("error");
            }
        }
        if (restDays) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                System.out.println("error");
            }
        } else if (!workingDays && !restDays) {
            System.out.println("error");
        }
        double total = price * count;
        if (total > 0) {
            System.out.printf("%.2f", total);
        }
    }
}
