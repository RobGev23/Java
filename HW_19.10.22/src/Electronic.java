public class Electronic extends Goods {
    protected double productWarranty;

    public Electronic(String productName, double price, double productWarranty) {
        super(productName, price);
        this.productWarranty = productWarranty;
    }




    @Override
    public String toString() {
        return "Electronic  "  +" '"+ productName +"' " +"  price - " + price +"$ "+  " Warranty - " + productWarranty+"$ " ;
    }

    ;
}
