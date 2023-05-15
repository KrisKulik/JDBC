import java.sql.*;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SQLException {

        CityDAO cityDAO = new CityDAOImpl();
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        City city = new City("Novosibirsk");
        cityDAO.addCity(city);
        System.out.println("Все города: " + cityDAO.getAllCity().contains(city));

        Employee employee1 = new Employee(8, "Jeremy", "Renner","male", 52, city);
        Employee employee2 = new Employee(9, "Anthony", "Mackie", "male", 44, city);
        city.setEmployees(List.of(employee1,employee2));

        City updateCity = cityDAO.updateCity(city);
        System.out.println(employeeDAO.getAllEmployee().containsAll(updateCity.getEmployees()));
    }
    }


