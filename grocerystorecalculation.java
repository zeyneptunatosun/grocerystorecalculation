import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        
        // Prices of vegetables (per kg)

        double tomatoPrice = 2.1;

        double cucumberPrice = 5.5;

        double carrotPrice = 3.75;

        double mintPrice = 10.0;

      
        
        // Ask the user for how many kilograms of each vegetable

        System.out.print("Tomato: ");

        double tomatoKg = scanner.nextDouble();

      
        
        System.out.print("Cucumber: ");

        double cucumberKg = scanner.nextDouble();

      
        
        System.out.print("Carrot: ");

        double carrotKg = scanner.nextDouble();

      
        
        System.out.print("Mint: ");

        double mintKg = scanner.nextDouble();


      
        
        // Calculate the total price

        double totalPrice = (tomatoKg * tomatoPrice) + (cucumberKg * cucumberPrice) 
                            + (carrotKg * carrotPrice) + (mintKg * mintPrice);

      
        
        // Print the total price
        System.out.printf("The customer should pay %.2f\n", totalPrice);

        scanner.close();

    }
}
