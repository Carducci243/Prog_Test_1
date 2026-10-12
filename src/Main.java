import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stores = new ArrayList<>(List.of("Cape Town", "Port Elizabeth", "Pretoria"));
        String[] items = {"Coffee", "Tea", "Boba Tea"};


        int[][] sales = new int[stores.size()][items.length];


        for (int i = 0; i < stores.size(); i++) {
            System.out.println("Enter sales for " + stores.get(i) + ":");
            for (int j = 0; j < items.length; j++) {
                System.out.print("  " + items[j] + ": ");
                sales[i][j] = scanner.nextInt();
            }
        }


        System.out.println("_______Sales Report______");
        for (int i = 0; i < stores.size(); i++) {
            System.out.println(stores.get(i) + ":");
            int storeTotal = 0;
            for (int j = 0; j < items.length; j++) {
                System.out.println("  " + items[j] + ": " + sales[i][j]);
                storeTotal += sales[i][j];
            }
            System.out.println("  Total: " + storeTotal);
        }

        scanner.close();
    }
}