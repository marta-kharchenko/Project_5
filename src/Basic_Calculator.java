import java.util.Scanner;

public class Basic_Calculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        print("Hello! Welcome to the calculator! ");
        String answer = getUserString(" Do you want to calculate something?");

        char again;
        do {
            if (!answer.equalsIgnoreCase("No")) {
                Double num1 = getUserDouble("Ok, than, enter the first number please: ");
                in.nextLine();
                String operation = getUserString("Enter the sign of operation please: ");
                Double num2 = getUserDouble("Enter the second number please: ");

                switch (operation) {
                    case "/" -> {
                        print("The result is: " + (num1 / num2));
                        double result = num1 / num2;
                        break;
                    }
                    case "*" -> {
                        print("The result is: " + (num1 * num2));
                        double result = num1 * num2;
                        break;
                    }
                    case "+" -> {
                        print("The result is: " + (num1 + num2));
                        double result = num1 + num2;
                        break;
                    }
                    case "-" -> {
                        print("The result is: " + (num1 - num2));
                        double result = num1 - num2;
                        break;
                    }
                }
            }

            repeatTheDialogYN();
            again = getUserString(" ").charAt(0);

        } while (again == 'Y' || again == 'y');
    }

    public static void print (String caption) {
        System.out.printf(caption);
    }

    public static String getUserString (String caption) {
        print(caption);
        return in.nextLine();
    }

    public static Double getUserDouble (String caption) {
        print(caption);
        return in.nextDouble();
    }

    public static void repeatTheDialogYN () {
        print("Do you want to repeat the dialog?");
        print("Enter 'Y' Yes or 'N' No.");
        getUserString(" ");
    }
}