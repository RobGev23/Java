public class Main {
    public static void main(String[] args) {
        /*
        First level:
        Создать класс Employee со следующими переменными:
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        private String position;
        Класс должен содержать конструктор, геттеры, сеттеры ,метод toString
        а также метод  public String getFullName().

        Создать и вывести на экран несколько обьектов этого класса

         */

        Employee employee1 = new Employee(1,"Tom","Crouse",35,"F","Boss");
        Employee employee2 = new Employee(1,"Jack","Richer",55,"M","Manager");
        Employee employee3 = new Employee(1,"John","McCain",45,"M","Boss");


        System.out.println(employee1.getFullName());
        System.out.println(employee2.getFullName());
        System.out.println(employee3.getFullName());
    }

}