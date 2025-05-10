import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Data input
        System.out.print("Shipping destination (International / National): ");
        var shipping = sc.nextLine().strip().toLowerCase();
        System.out.print("Package weight (Kg): ");
        var weight = Double.parseDouble(sc.nextLine());

        // Shipping Rate
        final int nationalRate = 10;
        final int internationalRate = 20;

        //Conditional
        Double shippingPrice = switch (shipping){
            case "national" -> weight * nationalRate;
            case "international" -> weight * internationalRate;
            default -> {
                System.out.println("Invalid data. Please make sure your destination is either national/international");
                yield null;
            }
        };
        if (shippingPrice != null){
            System.out.println("The shipping cost is: " +shippingPrice);
        }

    }
}