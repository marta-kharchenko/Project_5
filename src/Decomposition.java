// Pseudocode:

//This program is created to sign for the dance classes in properly age group and with teacher you want.

// 1) Welcome;
// 2) Ask the user for name;
// 3) Ask the user whether they want to study;
// 3.1) If yes, then ask the user for age;
// 3.1.1) Decide which group will be suitable;
// 3.1.2) Let the user choose the teacher;
// 3.1.3) Set day and time of first lesson;
// 3.2) If no, than output answer;
// 4) Ask the user for repeat the dialog;
// 4.1) If yes, than repeat the dialog;
// 4.2) If no, than end the dialog.

import java.util.Scanner;

public class Decomposition {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        print("Hello!");
        char again;

        // The body of code including the methods
        do {
            print("You are calling to 'Move' dance studio.");
            name();
            print("Do you want to start your classes with us?");
            String answer = getUserString();

            if (!answer.equalsIgnoreCase("No")) {
                chooseTheGroup();
            } else print("Sorry, then we can't help you.");

            repeatTheDialogYN();
            again = getUserString().charAt(0);

        } while (again == 'Y' || again == 'y');

        end();
    }

    //Method: Output
    public static void print (String caption) {
        System.out.println(caption);
    }

    //Method: Input strings
    public static String getUserString () {
        return in.nextLine();
    }

    //Method: Input numbers
    public static int getUserInt () {
        return in.nextInt();
    }

    //Method: Get the user name
    public static void name () {
        print("What is your name?");
        String name = getUserString();
        print("Nice to meet you, " + name + ".");
    }

    //Method: Get the user age
    public static int getUserAge() {
        System.out.println("Can you name your age please?");
        return in.nextInt();
    }

    //Method: Repeat the dialog
    public static void repeatTheDialogYN () {
        print("Do you want to repeat the dialog?");
        print("Enter 'Y' Yes or 'N' No.");
        getUserString();
    }

    //Method: Properly age group
    public static void chooseTheGroup () {
        print("Great, then, let us help you to choose the most comfortable option for you.");
        int age = getUserAge();

        if (age < 6) {
            print("Oh, I am so sorry, but we don't have any suggestions for such age group.");
        } else if (age <= 10) {
            print("Ok, than a younger group is for you.");
            teacherChoose();
        } else if (age <= 14) {
            print("Ok, than a middle group is for you.");
            teacherChoose();
        } else if (age <= 23) {
            print("Ok, than a senior group is for you.");
            teacherChoose();
        } else {
            print("Ok, than a older group is for you.");
            teacherChoose();
        }
    }

    //Method: Choose the teacher you want
    public static void teacherChoose () {
        print("We have a lot of professional teachers.");
        print("Who do you want to go for lessons to: 1.Kendall Vien, 2.Kim North or 3.Chloe Quanrif?");
        int teacher = getUserInt();

        switch (teacher) {
            case 1 -> {
                print("Great, then your teacher will wait for you on Wednesday at 12:00.");
                break;
            }
            case 2 -> {
                print("Great, then your teacher will wait for you on Tuesday at 12:00.");
                break;
            }
            case 3 -> {
                print("Great, then your teacher will wait for you on Friday at 12:00.");
                break;
            }
        }
    }

    //Method: End the dialog
    public static void end () {
        print("Goodbye!");
        in.close();
    }
}