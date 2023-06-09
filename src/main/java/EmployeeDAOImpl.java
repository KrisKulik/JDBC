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