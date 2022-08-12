import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollServiceTest {
    @Test
    void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() throws IOException {
        EmployeePayrollData employeePayrollData1 = new EmployeePayrollData(1,"sagar", 50000);
        EmployeePayrollData employeePayrollData2 = new EmployeePayrollData(2,"akshay", 30000);
        EmployeePayrollData employeePayrollData3 = new EmployeePayrollData(3,"rohit", 40000);

        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        employeePayrollDataList.add(employeePayrollData1);
        employeePayrollDataList.add(employeePayrollData2);
        employeePayrollDataList.add(employeePayrollData3);
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataList);
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        long count = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assertions.assertEquals(3,count);
    }
}
