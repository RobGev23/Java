public class Rooms {
    private double price;
    MyDate myDate ;
    private String fitnessCenter;

    public Rooms(double price, MyDate myDate, String fitnessCenter) {
        this.price = price;
        this.myDate = myDate;
        this.fitnessCenter = fitnessCenter;
    }

    public double getPrice() {
        return price;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public String getFitnessCenter() {
        return fitnessCenter;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "price=" + price +
                ", myDate=" + myDate +
                ", fitnessCenter='" + fitnessCenter + '\'' +
                '}';
    }
}
