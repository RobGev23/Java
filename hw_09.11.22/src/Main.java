public class Main {
    public static void main(String[] args) {
        /*
        Необходимо написать программу для сохранения данных о бронирование номеров гостиницы. В вашей программе должно быть несколько типов номеров, например: standard, superior, deluxe, president. Естественно, номера отличаются ценой проживания. Кроме того, номера категории de luxe, president предполагают доступ в fitness center, для остальных категорий номеров доступ в fitness center оплачивается как отдельная услуга. Ваша программа должна позволять сотрудникам отеля сохранить и просмотреть данные о бронирование,отменить бронирование, посмотреть все бронирования.

        Данные о бронирование если хотите, можно задать в программе константно или ввести через Scanner
        Для отражения дат бронирования необходимо использовать написанный ранее класс MyDate ( в данной задаче неиспользуем стандартные Java классы для работы с датой). В качестве дополнительных задач: в классе MyDate реализовать методы:
        - подсчета количества дней в заданном интервале дат
        - определения пересечения интервалов
         */

        DeluxeRoom deluxeRoom1 = new DeluxeRoom(350,new MyDate(25,11,2022),"Inclusive");
        System.out.println(deluxeRoom1);
        PresidentRoom presidentRoom1 = new PresidentRoom(450, new MyDate(13,9,2022),"Inclusive");
        System.out.println(presidentRoom1);
        SuperiorRoom superiorRoom1 = new SuperiorRoom(250,new MyDate(15,10,2022),"Separate payment");
        System.out.println(superiorRoom1);
        StandardRoom standardRoom1 = new StandardRoom(200,new MyDate(17,5,2022),"Separate payment");
        System.out.println(standardRoom1);

    }

}