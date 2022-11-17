import java.util.*;

class BuyGoods {
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
        System.out.println("You have chosen to buy:"+ amount + "Dollars worth of flour");
      if(choice == 2){
        System.out.println("You have chosen to buy cookies. How much would you like?");
        int amount = System.in.nextLine();
        System.out.println("You have chosen to buy:"+ amount + "Dollars worth of flour");
      }
        
      } 
    } 
  }
}