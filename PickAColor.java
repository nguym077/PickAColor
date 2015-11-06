/*
 * Pick a color, the program will then
 * suggest a place based on the color picked.
 */

import java.util.Scanner;

public class PickAColor {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Are you hungry?");
    System.out.print("Pick A Color! ");
    String color = console.next();

    while (!color.equalsIgnoreCase("yellow") &&
            !color.equalsIgnoreCase("orange") &&
            !color.equalsIgnoreCase("red")) {
      System.out.println("\nNot a valid color.");
      System.out.println("Pick Another Color >:[");
      System.out.print("--> ");
      color = console.next();
    }

    String food = "";
    if (color.equalsIgnoreCase("yellow")) {
      food = "Mcdonald";
    } else if (color.equalsIgnoreCase("orange")) {
      food = "Jamba Juice";
    } else if (color.equalsIgnoreCase("red")) {
      food = "Sbarro";
    }

    System.out.println("\nYou should go to " + food + "!");
  }
}
