import java.util.Scanner;

public class EmployeePayrollService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService=new EmployeePayrollService();
        EmployeePayroll employeePayroll = employeePayrollService.read();
        employeePayrollService.write(employeePayroll);
    }

    EmployeePayroll read() {
        System.out.println("Enter employee id");
        int id = scanner.nextInt();
        System.out.println("Enter employee name");
        String name = scanner.next();
        System.out.println("Enter employee salary");
        long salary = scanner.nextLong();
        return new EmployeePayroll(id,name,salary);
    }

    void write(EmployeePayroll employeePayroll){
        System.out.println(employeePayroll);
    }
}
