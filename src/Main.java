import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        boolean itemName = false;
        double unitPrice;
        String iteam = "";
        int quantity;
        //  boolean taxableRate ;
        System.out.println("Welcome to the Behind-The-Door Break Room Cafe.do you want an iteam if so press enter ");
        String userInput = sca.nextLine();
        //  System.out.println("enter the item name");
        // itemName = sca.nextLine();
        //  System.out.println("enter the item price");
        //  unitPrice = sca.nextDouble();
        double taxamount;
        String code = "";

        // bytes (0/1), short, int, String, char
        //if ()
        switch (code) {
            case "MD":
                taxamount = 6;
                break;
            case "VA":
                taxamount = 5.3;
                break;
            case "DC":
                taxamount = 5.75;
                break;
            default:
                taxamount = 5;
                break;
        }
        Random rand = new Random();

        taxamount = rand.nextInt();

        System.out.println("Your taxable is: " + taxamount);
        //  System.out.println("enter the iteam name");
        //  itemName= sca.nextLine();
        // boolean stop = false;
        String family = "";
        while (itemName == false) {
           System.out.println("Enter the iteam name (or type q to exit): ");
           userInput = sca.next();
            System.out.println(userInput);

           if (userInput.equalsIgnoreCase("q")) {
                itemName = true;
           } else {
               iteam += userInput + ", ";
                if (iteam == userInput) {
                  System.out.println("What is the price: ");
                   unitPrice = sca.nextDouble();
                   System.out.println(unitPrice);
                    System.out.println("How many do you want? ");
                    quantity = sca.nextInt();
                    System.out.println(quantity);

                } else if (iteam.contains("Q")) {
                    System.out.println("you do not want addtional iteam");
              }

    }
        }
    }

    public static double totalAmount(int quantity, double unitPrice) {
        double total = (quantity * unitPrice);
        return total;
    }

//    public static double sumeOfTheTotal(double lawnArea ) {
//        double subTotal = sum total;
//        return  subTotal;
}



