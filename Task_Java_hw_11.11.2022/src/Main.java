public class Main {
    public static void main(String[] args) {
        /*
        1.создать классы,
        содержащие методы для подсчета площади и периметра rectangle and circle,
        используя интерфейсы. Создать несколько обьектов этих типов и вывести  на экран
        их площадь и периметр

         */
        Area circle1 = new Circle(12);
        System.out.println(circle1.getArea());
        Perimeter circle2 = new Circle(16);
        System.out.println(circle2.getPerimeter());
    }
}