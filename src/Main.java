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
                    System.out.println("\nSelect a currency to convert from:");
                    System.out.println("1. MXN");
                    System.out.println("2. USD");
                    System.out.println("3. COP");
                    System.out.println("4. CAD");
                    System.out.print("Or enter the currency code you prefer (e.g., USD): ");
                    fromCurrency = scanner.nextLine().toUpperCase();
                    switch (fromCurrency){
                        case "1":
                            fromCurrency = "MXN";
                            break;
                        case "2":
                            fromCurrency = "USD";
                            break;
                        case "3":
                            fromCurrency = "COP";
                            break;
                        case "4":
                            fromCurrency = "CAD";
                            break;
                        default:
                            break;
                    }
                    System.out.println("\nSelect a currency to convert into:");
                    System.out.println("1. MXN");
                    System.out.println("2. USD");
                    System.out.println("3. COP");
                    System.out.println("4. CAD");
                    System.out.print("Or enter the currency code you prefer (e.g.1, MXN): ");
                    toCurrency = scanner.nextLine().toUpperCase();
                    switch (toCurrency){
                        case "1":
                            toCurrency = "MXN";
                            break;
                        case "2":
                            toCurrency = "USD";
                            break;
                        case "3":
                            toCurrency = "COP";
                            break;
                        case "4":
                            toCurrency = "CAD";
                            break;
                        default:
                            break;
                    }
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
