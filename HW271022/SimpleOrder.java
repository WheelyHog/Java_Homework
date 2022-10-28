package HW271022;

public class SimpleOrder extends Order {
    public SimpleOrder(String productName, String shippingAddress, int productPrice) {
        this.productName = productName;
        this.shippingAddress = shippingAddress;
        this.productPrice = productPrice;
        this.shippingTime = 5;
    }

    public int getPriceWithDelivery(int productPrice) {
        return productPrice + 8;
    }
}
