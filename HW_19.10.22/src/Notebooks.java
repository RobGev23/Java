public class Notebooks extends Electronic{

    public Notebooks(String productName, double price, double productWarranty) {
        super(productName, price, productWarranty);
    }

    @Override
    public String toString() {
        return "Notebooks " + " '"+ productName +"'  " + " price - " + price +"$ "+ "  Warranty - "+ productWarranty+"$";
    }
}
