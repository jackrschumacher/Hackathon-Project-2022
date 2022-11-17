import java.util.*;

class Story {
  public static void storyOutput() {
    Scanner input = new Scanner(System.in);

    System.out.println("=================");

    System.out.println("Where would you like to start?:");
    String startLocation = input.nextLine();
    System.out.println("You decide to start in " + startLocation);

    System.out.println("Where would you like your journey to end?");
    String endLocation = input.nextLine();
    System.out.println("You end in: " + endLocation);

    System.out.println("It is the year 1880. You are in " + startLocation
        + " you want to go westward in search of new opprotunities.");

    System.out.println("=================");

  }
}