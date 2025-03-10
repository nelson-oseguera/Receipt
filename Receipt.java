package Receipt;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Receipt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random generator = new Random();
		
		// Prompt the user for their name
		System.out.print("Enter your name: ");
		String userName = scanner.nextLine();
		
		// Prompt the user for the item's weight in ounces
		System.out.print("Enter the item's weight in ounces: ");
		float weightOunces = scanner.nextFloat();
		
		// Prompt the user for the price per pound of their item
		System.out.print("Enter the price per pound: ");
		float pricePerPound = scanner.nextFloat();
		
		// Calculate item weight in pounds and total cost
		float weightPounds = weightOunces / 16.0f;
		float totalCost = weightPounds * pricePerPound;
		
		// Generate a two-digit confirmation code
		int confirmationCode = generator.nextInt(90) + 10; // Generates a random number between 10 and 99
		
		// Convert user's name to upper case and replace space with a period
		String customerName = userName.toUpperCase().replace(" ", ".");
		
		// Create currency and decimal formatters
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		DecimalFormat decimalFormatter = new DecimalFormat("#.##");
		
		// Print the receipt
		System.out.println("\\\\\\ Welcome " + customerName + " ///");
        System.out.println("=================================");
        System.out.println(" Unit Price:\t " + currencyFormatter.format(pricePerPound) + " per pound");
        System.out.println(" Weight:\t " + decimalFormatter.format(weightPounds) + " pounds");
        System.out.println("=================================");
        System.out.println(" Total:\t\t " + currencyFormatter.format(totalCost));
        System.out.println(" Confirmation Code: " + confirmationCode);
		
	}

}
