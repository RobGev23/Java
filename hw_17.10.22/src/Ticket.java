public class Ticket  {
    private Route route;
    private MyDateTime dateTime;
    private double price;

    public Ticket(Route route, MyDateTime dateTime, double price) {
        this.route = route;
        this.dateTime = dateTime;
        this.price = price;
    }

    public Route getRoute() {
        return route;
    }

    public MyDateTime getDateTime() {
        return dateTime;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "Ticket ( " +  route + ", dateTime = " + dateTime + ", price = " + price + ')';
    }

    public long getDistance() {
        return route.getDistance();
    }
}
