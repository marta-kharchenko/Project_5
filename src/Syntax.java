import java.util.Scanner;

/**
 * Define a method
 * Call a method
 * Different arguments of different types
 * Methods without return value
 * Different types for return values
 * Into methods and sub-methods
 */

public class Syntax {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello!");
        nameAndAge(); //Call a method
    }

    //Define a method
    //Methods without return value
    //Into methods and sub-methods
    public static void nameAndAge () {
        System.out.println("Enter your name please:");
        String name = in.nextLine();
        String surname;
        surname = surnameFunction(name); //Call a method
        System.out.println("Nice to meet you, " + name + " " + surname + ".");
        int year;
        year = age(name, surname); //Call a method
        yearOutPut(year); //Call a method
    }

    //Define a method
    //Methods without return value
    public static void yearOutPut(int year) {
        System.out.println("You were born in " + year + ".");
    }

    //Define a method
    //Different arguments of different types
    //Different types for return values
    public static String surnameFunction(String name) {
        System.out.println("Dear, " + name + ", enter your surname please:");
        return in.nextLine();
    }

    //Define a method
    //Different arguments of different types
    //Different types for return values
    public static int age(String name, String surname) {
        System.out.println("Enter your age please, " + name + " " + surname + ".");
        int age = in.nextInt();
        return (2023 - age);
    }

}