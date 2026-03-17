package march_17;

public class Employee extends Person {

    double basicSalary;

    Employee(int id, String name, double basicSalary){
        super(id, name);
        this.basicSalary = basicSalary;
    }

    double calculateSalary(){
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;

        return basicSalary + hra + da;
    }

    void display(){
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("---------------------");
    }

}