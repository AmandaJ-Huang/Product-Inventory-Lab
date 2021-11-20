package io;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {

        /*
        TODO, allow user to:
            > create different products to be added to inventory
            > read from existing products
            > update products
            > delete products
            > get different reports about products
            > exit the program
         */

    private final Scanner input;
    private final PrintStream output;

    public Console() {
        this(System.in, System.out);
    }

    public Console(InputStream input, PrintStream output) {
        this.input = new Scanner(input);
        this.output = output;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... args) {
        print(val + "\n", args);
    }

    public String getStringInput(String prompt, Object... args) {
        print(prompt, args);
        return input.nextLine();
    }

    //main menu display for user
    public void mainMenu() {
        String userInput = getStringInput(new StringBuilder()
                .append("Please choose from the following options:")
                .append("\n 1. Create new product")
                .append("\n 2. Look at existing products")
                .append("\n 3. Update products")
                .append("\n 4. Delete products")
                .append("\n 5. Exit")
                .toString());

        switch(userInput) {
            case "1":
                inventoryMenu();
                break;
            case "2":
                print("Hey");
                break;
            case "3" :
                print("sup");
                break;
            case "4":
                print("nmhbu");
                break;
            case "5":
                print("good");
                break;
            case "6":
                printGoodbye();
                break;
            default:
        }
    }

    private void inventoryMenu() {
        String userinput = getStringInput("");
    }

    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");
    }

    public static void printGoodbye(){
        System.out.println("" +
                "**************************************************\n" +
                "***              Thanks for using              ***\n" +
                "***                    the                     ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "***                  Goodbye!                  ***\n" +
                "**************************************************");
    }
}
