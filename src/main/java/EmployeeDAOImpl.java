import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private final String user = "postgres";
    private final String password = "Battle4546";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";


    @Override
    public Integer addEmployee(Employee employee) {
        Integer id;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            id = (Integer) session.save(employee);
            transaction.commit();
        }
        return id;
    }


    @Override
    public Employee getEmployeeById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }

    @Override
    public List<Employee> getAllEmployee() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Employee").list();
        }
    }
    @Override
    public void updateEmployee(Employee employee, int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            employee.setId(id);
            session.update(employee);
            transaction.commit();
        }
    }
    public void deleteEmployee(Employee employee) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}




//    @Override
//    public void createEmployee(Employee employee) {
//        try (final Connection connection = DriverManager.getConnection(url, user, password);
//             PreparedStatement statement = connection.prepareStatement(
//                     "INSERT INTO employee(id,first_name, last_name, gender, age, city_id) " +
//                     "VALUES (?,?,?,?,?,?)")) {
//            statement.setInt(1,employee.getId());
//            statement.setString(2,employee.getFirstName());
//            statement.setString(3,employee.getLastName());
//            statement.setString(4,employee.getGender());
//            statement.setInt(5,employee.getAge());
//            statement.setInt(6,employee.getCity());
//            int resultSet = statement.executeUpdate();
//            System.out.println("Employee created");
//        } catch (SQLException e) {
//            System.out.println("Connection error");
//            e.printStackTrace();
//        }
//    }


//    @Override
//    public Employee getEmployeeById(int id) {
//        Employee employee = null;
//        try (final Connection connection = DriverManager.getConnection(url, user, password);
//             PreparedStatement statement = connection.prepareStatement(
//                     "SELECT * FROM employee WHERE id=" + id)) {
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int idOfEmployee = resultSet.getInt("id");
//                String firstNameOfEmployee = resultSet.getString("first_name");
//                String lastNameOfEmployee = resultSet.getString("last_Name");
//                String genderNameOfEmployee = resultSet.getString("gender");
//                int ageOfEmployee = resultSet.getInt("age");
//                int cityNameOfEmployee = resultSet.getInt("city_id");
//            }
//        } catch (SQLException e) {
//            System.out.println("Connection error");
//            e.printStackTrace();
//        }
//        return employee;
//    }



//        List<Employee> employees = new ArrayList<>();
//        try (final Connection connection = DriverManager.getConnection(url, user, password);
//             PreparedStatement statement = connection.prepareStatement("SELECT * FROM employee")) {
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int idOfEmployee = resultSet.getInt("id");
//                String firstNameOfEmployee = resultSet.getString("first_name");
//                String lastNameOfEmployee = resultSet.getString("last_name");
//                String genderOfEmployee = resultSet.getString("gender");
//                int ageOfEmployee = resultSet.getInt("age");
//                int cityNameOfEmployee = resultSet.getInt("city_id");
//                employees.add(new Employee(idOfEmployee, firstNameOfEmployee, lastNameOfEmployee, genderOfEmployee, ageOfEmployee, cityNameOfEmployee));
//            } System.out.println("All list");
//        } catch (SQLException e) {
//            System.out.println("Connection error");
//            e.printStackTrace();
//        }
//        return employees;
//    }



//        try (final Connection connection = DriverManager.getConnection(url, user, password);
//             PreparedStatement statement = connection.prepareStatement(
//                     "UPDATE employee SET first_name=?,last_name=?,gender=?,age=? WHERE id =?")) {
//            statement.setString(1, employee.getFirstName());
//            statement.setString(2, employee.getLastName());
//            statement.setString(3, employee.getGender());
//            statement.setInt(4, employee.getAge());
//            statement.setInt(5, employee.getId());
//            int resultSet = statement.executeUpdate();
//            System.out.println("Employee update");
//        } catch (SQLException e) {
//            System.out.println("Connection error");
//            e.printStackTrace();
//
//        }
//    }


//                try (final Connection connection = DriverManager.getConnection(url, user, password);
//                     PreparedStatement statement = connection.prepareStatement("DELETE FROM employee WHERE id = " + id)) {
//                    int resultSet = statement.executeUpdate();
//                    System.out.println("Employee removed");
//                } catch (SQLException e) {
//                    System.out.println("Connection error");
//                    e.printStackTrace();
//                }
//            }