/*
 * Pick a color, the program will then
 * suggest a place based on the color picked.
 */

import java.util.Scanner;
import java.util.Random;

public class PickAColor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        
        String[] yellow = {"Mcdonalds", "Carl's Jr", "Burger King", "In-N-Out",
                            "El Pollo Loco", "Sonics", "Denny's", "Buffalo Wild Wings"};
        String[] orange = {"Jamba Juice", "Hooters", "Arby's", "noodles & company",
                           "Panda Express"};
        String[] red = {"Sbarro", "TGI Fridays", "KFC", "Diary Queen",
                        "Pizza Hut", "Wendy's", "Chipotle", "Red Robin", "Chick-fil-A", 
                        "Five Guys"};
        String[] green = {"Subway", "Starbucks", "Panera Bread", "Wingstop"};
        String[] blue = {"IHOP", "Baskin Robins", "White Castle", "Long John Silver's"};
        String[] purple = {"Taco Bell", "Cafe Tu Tu Tango"};
        String[] pink = {"Dunkin Donuts", "Pink Berry"};

        System.out.println("Are you hungry?");
        System.out.print("Pick A Color! ");
        String color = console.next();
        
        while (!color.equalsIgnoreCase("yellow") &&
                !color.equalsIgnoreCase("orange") &&
                !color.equalsIgnoreCase("red") &&
                !color.equalsIgnoreCase("green") &&
                !color.equalsIgnoreCase("blue") &&
                !color.equalsIgnoreCase("purple") &&
                !color.equalsIgnoreCase("pink")) {
            System.out.println("\nNot a valid color.");
            System.out.println("Pick Another Color >:[");
            System.out.print("--> ");
            color = console.next();
        }

        String food = "";
        int num;
        if (color.equalsIgnoreCase("yellow")) {
            num = rand.nextInt(yellow.length);
            food = yellow[num]; 
        } else if (color.equalsIgnoreCase("orange")) {
            num = rand.nextInt(orange.length);
            food = orange[num];
        } else if (color.equalsIgnoreCase("red")) {
            num = rand.nextInt(red.length);
            food = red[num];
        } else if (color.equalsIgnoreCase("green")) {
            num = rand.nextInt(green.length);
            food = green[num];
        } else if (color.equalsIgnoreCase("blue")) {
            num = rand.nextInt(blue.length);
            food = blue[num];
        } else if (color.equalsIgnoreCase("purple")) {
            num = rand.nextInt(purple.length);
            food = purple[num];
        } else if (color.equalsIgnoreCase("pink")) {
            num = rand.nextInt(pink.length);
            food = pink[num];
        }

        System.out.println("\nYou should go to " + food + "!");
    }
}
