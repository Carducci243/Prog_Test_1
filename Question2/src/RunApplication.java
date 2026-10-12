import java.util.Scanner;

public class RunApplication {
        public static void main(String[] args) {

//            initiating Scanner
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select the beverage type");
            System.out.println("1. COFFEE");
            System.out.println("2. TEA");
            System.out.println("3. HOT CHOCOLATE");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            String beverageType = "";
//          Switch Method fro choice defaults to coffee when the input is wrong
            switch (choice) {
                case 1:
                    beverageType = "COFFEE";
                    break;
                case 2:
                    beverageType = "TEA";
                    break;
                case 3:
                    beverageType = "HOT CHOCOLATE";
                    break;
                default:
                    System.out.println("Wrong choice");
                    beverageType = "COFFEE";
            }

            System.out.print("Enter the city ");
            String city = scanner.nextLine();

            System.out.print("Enter JCoffee's total sales to display ");
            int totalSales = scanner.nextInt();

            BeverageSales sale = new BeverageSales(beverageType, city, totalSales);
            sale.printReport();
            scanner.close();
        }
    }
