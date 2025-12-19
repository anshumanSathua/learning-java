import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int quantity;
        double price,total;
        String item;

        System.out.print("What you want: ");
        item = scanner.nextLine();

        System.out.print("How many you want: ");
        quantity = scanner.nextInt();

        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();

        total = quantity * price;

        System.out.println("\nYou have bought "+quantity+" "+item+"/s and your total would be "+total+".");

        scanner.close();

    }
}