public class Main {
    public static void main(String[] args) {
        /*
      First level:
       Создать класс "Employee", имеющий:
       конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
       следующие методы: addSalary() , который добавляет 10 евро к зарплате сотрудника если она меньше 500     и addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
       создать несколько сотрудников и применить к ним методы
       */

        Employee employee1 = new Employee("John",499,7);
        Employee employee2 = new Employee("Ann",500,6);
        Employee employee3 = new Employee("Jack",350,7);

        System.out.println("Salary of Employee = "+ employee1.name+" "+employee1.addSalary()+"$");
        System.out.println( "Salary of Employee with working hours = "+ employee1.name+" "+employee1.addWorkingHours()+"$");

        System.out.println("Salary of Employee = "+ employee2.name+" "+employee2.addSalary()+"$");
        System.out.println("Salary of Employee with working hours = "+ employee2.name+" "+employee2.addWorkingHours()+"$");

        System.out.println("Salary of Employee = "+ employee3.name+" "+employee3.addSalary()+"$");
        System.out.println("Salary of Employee with working hours = "+ employee3.name+" "+employee3.addWorkingHours()+"$");


        /*
      Second level:
       Создать метод, вычисляющий индекс массы тела (BMI)  и  печатающий результат:
       Метод использует вес в килограммах и рост в метрах.  .
       Метод должен находиться в классе Body и выводить следующие сообщения:
       "Underweight" если BMI  меньше 18.5
       "Normal" если 18.5<=BMI<25
       "Overweight" если  25<=BMI<30
       Obese  если BMI>=30
       Формула для расчета BMI = weight/height*height
       Вес и рост передаются через конструктор
         */
    }
}