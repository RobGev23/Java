import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*
    • Создать интерфейс MailDeliveryService с одним методом void sendMail().
    • Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
    • Создайте класс Email, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
    • Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService. Его способ отправки почты — напечатать что-то вроде: «Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
    • Создайте класс Sender. Реализуйте в нем метод send(), который в качестве аргумента MailDeliveryService и отправляет почту с помощью данной службы.
    • Реализуйте диалог с пользователем (использовать Scanner), как отправлять почту и отправлять ее с помощью Sender.

   */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello please enter what is the option you want");
        System.out.println("Option 1 DHL");
        System.out.println("Option 2 Pigeon");
        System.out.println("Option 3 Email");
        int option = scanner.nextInt();
        if (option < 1 || option > 3 ){
            System.out.println("You enter a wrong number. Please try again");
        }
        Sender.send(option);
    }

}