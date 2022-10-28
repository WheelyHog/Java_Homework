package HW271022;

public class Order {
    protected String productName;
    protected String shippingAddress;
    protected int productPrice;
    protected int shippingTime;

    public static void main(String[] args) {
    SimpleOrder simpleOrder1 = new SimpleOrder("Milk", "Wroclaw, Rynok 6", 3);
    SimpleOrder simpleOrder2 = new SimpleOrder("Water", "Krakow, Powstancow, 12", 5);
        System.out.println(simpleOrder2.productName);

        System.out.println(simpleOrder1.productName + ", " + simpleOrder1.shippingAddress + ", " + simpleOrder1.shippingTime);
        System.out.println(simpleOrder1.getPriceWithDelivery(5));

    PrimeOrder primeOrder1 = new PrimeOrder("Suit Gucci", "Warszawa", 150);
        System.out.println(primeOrder1.getPriceWithDelivery(200));
    }
}

