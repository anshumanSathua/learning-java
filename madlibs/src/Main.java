import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String adjective1, adjective2,adjective3,noun1,verb;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal/person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an verb(action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective(description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday i went to a "+adjective1+" zoo.");
        System.out.println("In an exhibit i saw a "+noun1+".");
        System.out.println(noun1+" Was "+adjective2+" and "+verb+"!");
        System.out.println("I was "+adjective3+"!");

        scanner.close();
    }
}