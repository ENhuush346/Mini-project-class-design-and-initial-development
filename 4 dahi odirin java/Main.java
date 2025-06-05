import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

products.add(new Product("Printer", 300000, 2));
products.add(new Product("Mouse", 4000, 5));
products.add(new Product("Notebook", 250000, 1));
products.add(new Product("Desktop PC", 180000, 3));
products.add(new Product("Keyboard", 8000, 7));
products.add(new Product("Monitor", 120000, 4));
products.add(new Product("USB Flash Drive", 15000, 10));
products.add(new Product("External Hard Drive", 45000, 6));
products.add(new Product("Webcam", 20000, 3));
products.add(new Product("Power Supply", 15000, 8));
products.add(new Product("HDMI Cable", 2500, 12));
products.add(new Product("Ethernet Cable", 3000, 15));
products.add(new Product("Graphics Card", 350000, 2));
products.add(new Product("RAM Module", 60000, 5));
products.add(new Product("CPU Cooler", 18000, 4));
products.add(new Product("Motherboard", 220000, 3));
products.add(new Product("Operating System Software", 90000, 7));
products.add(new Product("Office Software", 45000, 6));
products.add(new Product("Wireless Router", 40000, 4));
products.add(new Product("Bluetooth Headset", 12000, 5));



        System.out.println("Product list:");
        for (Product p : products) {
            System.out.println("- " + p);
        }


        System.out.print("\nEnter the product name to remove: ");
        String nameToRemove = scanner.nextLine();


        boolean removed = products.removeIf(p -> p.getName().equalsIgnoreCase(nameToRemove));


        if (removed) {
            System.out.println(nameToRemove + " was successfully removed.");
        } else {
            System.out.println(nameToRemove + " not found.");
        }


        System.out.println("\nUpdated list:");
        for (Product p : products) {
            System.out.println("- " + p);
        }
    }
}
