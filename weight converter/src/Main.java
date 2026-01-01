import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight, newWeight;

        System.out.println("Welcome to weight converter...");

        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();

        System.out.print("Enter 1 for convert to kg or 2 for convert to lbs: ");
        choice = scanner.nextInt();

        if(choice == 1){
            newWeight = weight * 0.45359237;
            System.out.printf("Your weight in kg = %.2f kg.",newWeight);
        } else if (choice == 2) {
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in lbs = %.2f lbs.",newWeight);
        }else {
            System.out.println("Please enter a valid choice !");
        }

        scanner.close();
    }
}