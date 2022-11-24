public class Rooms {
    private double price;
    MyDate myDate ;

    public Rooms(double price, MyDate myDate) {
        this.price = price;
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "price=" + price +
                ", myDate=" + myDate +
                '}';
    }
}
