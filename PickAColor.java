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

    while (!color.equalsIgnoreCase("yellow")) {
      System.out.println("\nNot a valid color.");
      System.out.println("Pick Another Color >:[");
      System.out.print("--> ");
      color = console.next();
    }

  }
}
