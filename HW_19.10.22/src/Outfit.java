public class Outfit extends Goods {

    public Outfit(String productName, double price) {
        super(productName, price);
    }

    @Override
    public String toString() {
        return "Outfit "  +" '"+ productName +"' "+ "  price - " + price+"$ ";
    }
}
