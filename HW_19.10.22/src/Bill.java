public class Bill {
    private String productName;
    private double price;
    private double urgentDelivery;


    public Bill(String productName, double price, double urgentDelivery) {
        this.productName = productName;
        this.price = price;
        this.urgentDelivery = urgentDelivery;
    }

    public double getUrgentDelivery() {
        return price*0.1;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", urgentDelivery=" + urgentDelivery +
                '}';
    }
}
