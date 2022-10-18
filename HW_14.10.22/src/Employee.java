public class Employee {
    public double salary;
    public double workingHours;
    public String name;


    public Employee(String name,double salary, double workingHours) {
        this.salary = salary;
        this.workingHours = workingHours;
        this.name=name;
    }

    public double addSalary() {
        if (salary<500){
            salary=salary+10;
        }
        return salary;
    }

    public double addWorkingHours() {
        if (workingHours > 6) {
            salary = salary + 5;
        }
        return salary;
    }

}
