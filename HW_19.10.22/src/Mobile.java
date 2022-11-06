public class Mobile extends Electronic{

    protected   double contract;

    public Mobile(String productName, double price, double productWarranty, double contract) {
        super(productName, price, productWarranty);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    @Override
    public void getGoods() {
        System.out.println("Product name " + productName + " Price -" + price + " Warranty" + " Contract " + contract );
    }
}
