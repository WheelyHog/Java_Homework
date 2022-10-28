package HW271022;

public class PrimeOrder extends Order{
    public PrimeOrder(String productName, String shippingAddress, int productPrice) {
        this.productName = productName;
        this.shippingAddress = shippingAddress;
        this.productPrice = productPrice;
        this.shippingTime = 3;
    }
    public int getPriceWithDelivery (int productPrice){
        return productPrice;
    }
}
