public class Main {
    public static void main(String[] args) {
        /*
 TODO   1.   Представьте, вы пишите программу для автопарка или, например, для авиакомпании. Вам необходимо  создать класс Ticket ,  который должен содержать следующие поля Route route, MyDateTime time, double price. Как вы   догадываетесь, Route и MyDateTime тоже  классы: Route{String number, String  from, String destination, long distance}   MyDateTime (day,month,year,hour,min). Далее вам необходимо:
         a)      создать несколько разных билетов, положить их в массив.
         b)      Реализовать метод, который выводит информацию обо всех билетах
         c)      Реализовать метод, который считает суммарную стоимость билетов.
         d)      Необходимо посчитать суммарную дистанцию всех маршрутов (предположим, что у вас нет билетов с одним и тем же маршрутом, т.е. задача сводится к простому суммированию всех distance)
         e)      Реализовать в билете метод изменения времени отправления.

         2.  	Представьте, вы пишите программу для on-line магазина (или для школы, для больницы, для отеля….) . выберете любую предметную область. Опишите несколько классов и создайте несколько объектов для выбранной предметной области.
         */

        Ticket ticket1 = new Ticket(new Route("135", "Berlin", "London", 2500), new MyDateTime(25, 12, 2022, 23, 30), 350);
        Ticket ticket2 = new Ticket(new Route("125", "Berlin", "France", 2000), new MyDateTime(15, 11, 2022, 22, 15), 450);
        Ticket ticket3 = new Ticket(new Route("100", "Berlin", "Leipzig", 1500), new MyDateTime(15, 10, 2022, 21, 20), 650);
        Ticket ticket4 = new Ticket(new Route("115", "Berlin", "Paris", 2700), new MyDateTime(20, 19, 2022, 20, 00), 250);


        Ticket[] tickets = {ticket1, ticket2, ticket3, ticket4};
        for (int i = 0; i < tickets.length; i++) {
            System.out.println(tickets[i].toString());
        }
/*
        System.out.println("----------------------------------------------");

        for (Ticket ticket : tickets){
            System.out.println(ticket);
        }
*/
        System.out.println("------------------------------------------------");


        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Ticket price " + tickets[i].getPrice());
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Price sum " + priceSum(tickets));

        System.out.println("-------------------------------------------------");
        System.out.println("Distance sum " + distanceSum(tickets));

    }

    public static double priceSum(Ticket[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getPrice();
        }
        return sum;
    }

    public static int distanceSum(Ticket[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getDistance();
        }
        return sum;
    }
}