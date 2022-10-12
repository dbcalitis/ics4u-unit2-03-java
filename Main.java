/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-03
*/

// Imports
import java.util.Scanner;

/**
*  Main class.
*/
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Declaring classes.
        final Scanner scan = new Scanner(System.in);
        final MrCoxallStack stack = new MrCoxallStack();

        boolean continueLoop = true;


        String answer = "";

        while (continueLoop) {
            System.out.println("Enter 'q' to exit the loop.");
            System.out.print("Enter action (pop/peek/push): ");
            int num = 0;
            answer = scan.nextLine();

            switch (answer.toLowerCase()) {
                case "pop":
                    System.out.println(stack.popItem());
                    break;
                case "peek":
                    System.out.println(stack.peekItem());
                    break;
                case "push":
                    System.out.print("Enter a number: ");
                    num = scan.nextInt();
                    stack.pushItem(num);
                    break;
                default:
                    break;
            }

            if ("q".equals(answer)) {
                continueLoop = false;
            }

            if (("q".equals(answer)) &&
                ("push".equals(answer)) &&
                ("peek".equals(answer)) &&
                ("pull".equals(answer))) {
                    System.out.println("Enter a valid action.");
            }

            System.out.println();
        }

        System.out.println("\nDone.");
    }
}

