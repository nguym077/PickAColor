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

    System.out.println("Are you hungry?");
    System.out.print("Pick A Color! ");
    String color = console.next();

    while (!color.equalsIgnoreCase("yellow") &&
            !color.equalsIgnoreCase("orange") &&
            !color.equalsIgnoreCase("red") &&
            !color.equalsIgnoreCase("green") &&
            !color.equalsIgnoreCase("blue") &&
            !color.equalsIgnoreCase("purple")) {
      System.out.println("\nNot a valid color.");
      System.out.println("Pick Another Color >:[");
      System.out.print("--> ");
      color = console.next();
    }

    String food = "";
    if (color.equalsIgnoreCase("yellow")) {
      int num = rand.nextInt(2) + 1;
      if (num == 1) {
        food = "Mcdonalds";
      } else if (num == 2) {
        food = "Carl's Jr";
      } 
    } else if (color.equalsIgnoreCase("orange")) {
      food = "Jamba Juice";
    } else if (color.equalsIgnoreCase("red")) {
      food = "Sbarro";
    } else if (color.equalsIgnoreCase("green")) {
      food = "Subway";
    } else if (color.equalsIgnoreCase("blue")) {
      food = "IHOP";
    } else if (color.equalsIgnoreCase("purple")) {
      food = "Taco Bell";
    }

    System.out.println("\nYou should go to " + food + "!");
  }
}
