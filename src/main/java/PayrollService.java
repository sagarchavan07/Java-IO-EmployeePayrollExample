import java.io.IOException;
import java.util.List;

public interface PayrollService {
    void read();

    boolean write(List<EmployeePayrollData> employeePayrollDataList) throws IOException;

    long countEntries() throws IOException;
}
