public class Electronic extends Bill {
    private boolean guarantee;
    private boolean contract;

    public Electronic(String productName, double price, double urgentDelivery, Bill receipts, boolean guarantee, boolean contract) {
        super(productName, price, urgentDelivery);
        this.guarantee = guarantee;
        this.contract = contract;
    }

    public boolean getGuarantee() {
        return guarantee;
    }

    public boolean getContract() {
        return contract;
    }
}
