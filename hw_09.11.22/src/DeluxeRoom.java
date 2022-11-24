public class DeluxeRoom extends Rooms{
   // private String fitnessCenter;

    public DeluxeRoom(double price, MyDate myDate, String fitnessCenter) {
        super(price, myDate);
        //this.fitnessCenter = fitnessCenter;
    }



    @Override
    public String toString() {
        return "DeluxeRoom { " +
                //fitnessCenter + '\'' + myDate +
                '}';
    }
}
