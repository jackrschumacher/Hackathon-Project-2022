import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("The Java Trail");



  }
}

public static void backgroundStory(){
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



public static void BuyGoods(){
    Scanner input = new Scanner(System.in);
    int javaCoin = 10000;
    
    String items = "Items to Buy" + 
      "1.Food\n"+ 
      "2.Horses\n"+
      "3.Wagon\n"+
      "4.Spare Parts\n"+
      "5.Water";
    System.out.println(items);
    
    int choice = System.in.nextLine();
    if (choice == 1){
      System.out.println("You have chosen To buy Food. What kind of food do you want to buy?");
      String foodItems = "1. Flour"+
        "Cookies"+
        "Java Beans"+
        "Meat";
      System.out.println(foodItems);
      
      int choice = System.in.nextLine();
      if(choice == 1){
        System.out.println("You have chosen to buy flour. How much flour would you like?");
        int amount = System.in.nextLine();
        System.out.println("You have chosen to buy:"+ amount + "javaCoin worth of Flour");
      if(choice == 2){
        System.out.println("You have chosen to buy cookies. How much would you like?");
        int amount = System.in.nextLine();
        System.out.println("You have chosen to buy:"+ amount + "javaCoin worth of cookies");
      }
      if(choice == 3){
        System.out.println("You have chosen to buy Java Beans");
        int amount = System.in.nextLine();
        System.out.println("You have chosen to buy:"+ amount + "JavaCoin worth of Java Beans");
      }
        
        
      } 
    } 
  }
}
public static void Traveling(){
  import java.util.*;

class Traveling {
  public static void taveling(){
    Scanner input = new Scanner(System.in);
    
    int randomEvent = (int)(Math.random() * 10);
    
    if(randomEvent = 1){
      System.out.println("Oh No! You got Dysentery! Would you like to use a caster oil?");
      String grossIncome = input.nextDouble();
      if()
    }
    
    if(randomEvent = 2){
      System.out.println("Event 2");
    }
    
    if(randomEvent = 3){
      System.out.println("Event 3");
    }
    
    if(randomEvent = 4){
      System.out.println("Event 4");
    }
    
    if(randomEvent = 5){
      System.out.println("Event 5");
    }
    
    if(randomEvent = 6){
      System.out.println("Event 6");
    }
    
    if(randomEvent = 7){
      System.out.println("Event 7");
    }
    
    if(randomEvent = 8){
      System.out.println("Event 8");
    }
    
    if(randomEvent = 9){
      System.out.println("Event 9");
    }
    
    if(randomEvent = 10){
      System.out.println("Event 10");
    }
    
  }
}
}
}

/*
 * Reference Code:
 * .next();
 * 
 */