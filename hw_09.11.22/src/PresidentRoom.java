public class PresidentRoom extends Rooms {
    public PresidentRoom(double price, MyDate myDate) {
        super(price, myDate);
    }

    @Override
    public String toString() {
        return "PresidentRoom{" +
                "myDate=" + myDate +
                '}';
    }
}
