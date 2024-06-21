import java.util.Scanner;

public class Main {
    //https://v6.exchangerate-api.com/v6/26326636e6e810d6b62039f3/latest/USD EXAMPLE REQUEST
    //https://v6.exchangerate-api.com/v6/26326636e6e810d6b62039f3/pair/USD/MXN/1
    public static void main(String[] args) {
        RequestConversion conversion = new RequestConversion();
        Scanner scanner = new Scanner(System.in);
        String fromCurrency, toCurrency;
        float amount;

        while (true) {
            System.out.println("============================");
            System.out.println("     Currency Converter     ");
            System.out.println("============================");
            System.out.println("1. Convert Currency");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("\nCurrency Conversion");
                    System.out.print("Enter currency to convert from (e.g., USD): ");
                    fromCurrency = scanner.nextLine().toUpperCase();
                    System.out.print("Enter currency to convert to (e.g.1, MXN): ");
                    toCurrency = scanner.nextLine().toUpperCase();
                    System.out.print("Enter amount: ");
                    amount = scanner.nextFloat();
                    scanner.nextLine();  // Consume newline

                    Currency result = conversion.fetchData(fromCurrency, toCurrency, amount);
                    System.out.println("\nConversion Result:");
                    System.out.println(result);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        }
    }
}
