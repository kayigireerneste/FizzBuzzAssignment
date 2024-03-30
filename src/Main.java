import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        for (int i = 10; i > 0 ; i--) {
            System.out.println("You have " + i + " trials to play");
            System.out.print("Enter an number: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number < 0)
                    System.out.println("Please Enter any positive Integer");
                else {
                    if (number % 5 == 0) {
                        if (number % 3 == 0)
                            System.out.println("FizzBuzz");
                        else
                            System.out.println("Fizz");
                    }
                    else if (number % 3 == 0)
                        System.out.println("Buzz");
                    else
                        System.out.println(number);
                }
            }
            else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }
}