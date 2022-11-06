public class Products extends Goods {

    private double deliveryPrice;

    public Products(String productName, double price, double deliveryPrice) {
        super(productName, price);
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public String toString() {
        return "Products   "  + " '" +productName +"' "+" price- " + price +"$ " + " Delivery Price - " + deliveryPrice+ "$ ";
    }
}
