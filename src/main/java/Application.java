import java.sql.*;

public class Application {

    public static void main(String[] args) throws SQLException {

        Employee employee = new Employee(7,"Leonardo", "DiCaprio","male", 48,5);
        EmployeeDAO employeeDao = new EmployeeDAOImpl();

        Integer employeeId = employeeDao.addEmployee(employee);
        System.out.println(employeeDao.getAllEmployee());

    }
}

