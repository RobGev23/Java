public class Outfit extends Bill {
    private double size;
    private String color;

    public Outfit(String productName, double price, double urgentDelivery, double size, String color) {
        super(productName, price, urgentDelivery);
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Outfit{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
