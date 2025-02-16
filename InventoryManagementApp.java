import java.util.Scanner;

public class InventoryManagementApp {
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Inventory Management System!");
        System.out.println("Developed by: Raphael Louis Alcazar");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    ims.addProduct(name, price);
                    break;

                case 2:
                    ims.displayProducts();
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}