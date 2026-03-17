package march_17;

public class PayrollDemo {

    public static void main(String[] args) {

        Employee emp[] = new Employee[5];

        emp[0] = new Employee(1,"Tanisha",30000);
        emp[1] = new TeachingStaff(2,"Maitri",40000,"Java",5000);
        emp[2] = new Employee(3,"Naaz",25000);
        emp[3] = new TeachingStaff(4,"Arman",45000,"DBMS",6000);
        emp[4] = new Employee(5,"Om",28000);

        System.out.println("------ Payroll Report ------");

        for(int i=0;i<emp.length;i++){
            emp[i].display();
        }

    }

}