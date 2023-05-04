import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        Employee employee = new Employee(9,"Leonardo", "DiCaprio","male", 48,5);
        EmployeeDAO employeeDao = new EmployeeDAOImpl();

        Integer employeeId = employeeDao.addEmployee(employee);
        System.out.println(employeeDao.getAllEmployee());



//        final String user = "postgres";
//        final String password = "Battle4546";
//        final String url = "jdbc:postgresql://localhost:5432/skypro";
//
//        try (final Connection connection = DriverManager.getConnection(url, user, password);
//             PreparedStatement statement = connection.prepareStatement("" +
//                     "SELECT * FROM employee city JOIN employee ON employee.city_id = city.city_id " +
//                     "WHERE employee.id = (?)")) {
//
//            statement.setInt(1, 5);
//            final ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                String firstName = "First name: " + resultSet.getString("first_name") + ", ";
//                String lastName = "Last name: " + resultSet.getString("last_name") + ", ";
//                String gender = "Gender: " + resultSet.getString(4) + ", ";
//                int idCity = resultSet.getInt(6);
//
//                System.out.println(firstName + lastName + gender + idCity);
//            }
//        } catch (SQLException e) {
//            System.out.println("Connection error");
//            e.printStackTrace();
//
//        }
//
//        System.out.println(" ");
//
//        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        List<Employee> employees = employeeDAO.getAllEmployee();
//
//
//        for (Employee employee : employees) {
//            System.out.println("id: " + employee.getId());
//            System.out.println("First Name: " + employee.getFirstName());
//            System.out.println("Last Name: " + employee.getLastName());
//            System.out.println("Gender: " + employee.getAge());
//        }
//
//        System.out.println(" ");
//
//        employeeDAO.updateEmployee(new Employee(1, "Mark", "Ruffalo", "male", 48, 1));
//        List<Employee> updateEmployee = employeeDAO.getAllEmployee();
//        for (Employee employee : updateEmployee) {
//            System.out.println(employee);
//        }

    }
}

