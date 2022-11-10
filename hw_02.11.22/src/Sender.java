public class Sender {


    static void send(int way) {
        switch(way) {
            case 1:
                System.out.println("You send with DHL");
                break;
            case 2:
                System.out.println("You send with Pigeon");
                break;
            case 3:
                System.out.println("You send with Email");
                break;
        }
    }
}
