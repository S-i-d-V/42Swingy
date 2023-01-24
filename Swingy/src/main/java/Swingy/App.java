package Swingy;

//Java
import java.util.Scanner;
import java.util.ArrayList;

//My imports
import Swingy.Model.Hero;

public class App 
{
    public static void main(String[] args) {
        int userChoice;
        boolean quit = false;
        Scanner input = new Scanner(System.in);

        while (!quit) {
            System.out.println("Swingy RPG");
            System.out.println("1. Create a new Hero");
            System.out.println("2. Select a hero");
            System.out.println("3. Quit");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    createHero();
                    break;
                case 2:
                    selectHero();
                    break;
                case 3:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        input.close();
    }

    public static void createHero() {
        //Header
        System.out.println("Hero creation:");
        //Add a heroes to the ArrayList
    }

    public static void selectHero() {
        //Header
        System.out.println("Hero creation:");
        //Display each hero with his uid
    }
}


