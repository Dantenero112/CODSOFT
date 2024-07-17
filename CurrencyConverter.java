import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input currency selection and rate
        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.nextLine();
        
        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine();
        
        System.out.print("Enter the exchange rate (1 " + baseCurrency + " = x " + targetCurrency + "): ");
        double exchangeRate = scanner.nextDouble();

        // Input amount
        System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amount = scanner.nextDouble();

        // Perform conversion
        double convertedAmount = amount * exchangeRate;

        // Display result
        System.out.println(amount + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}