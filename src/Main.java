import animal.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Animal[] animals = {new Camel(), new Lion(), new Deer(), new Goose(), new Bat(), new Rabbit()};
        final Scanner scanner = new Scanner(System.in);

        String input;
        do {
            System.out.println("Please enter the number of the habitat you would like to view:");
            input = scanner.next();

            if (isValidInput(input)) {
                animals[Integer.parseInt(input)].print();
            } else if (isExitCode(input)) {
                System.out.println("See you later!");
            } else {
                System.out.println("invalid input. try again or type exit to leave.\n");
            }

        } while (!isExitCode(input));
    }

    private static boolean isExitCode(String input) {
        return "exit".equalsIgnoreCase(input);
    }

    private static boolean isValidInput(String input) {
        return input.length() == 1 && "012345".contains(input);
    }
}