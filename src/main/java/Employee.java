import javax.persistence.*;

@Entity
@Table (name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "first_name", length = 50, nullable = false)
    private String firstName;
    @Column (name = "last_name", length = 50, nullable = false)
    private String lastName;
    @Column (name = "gender", length = 10, nullable = false)
    private String gender;
    @Column (name = "age", nullable = false)
    private int age;
    @Column (name = "city_id")
    private Integer city;

    public Employee(Integer id, String firstName, String lastName, String gender, int age, Integer city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "id: " + id + ", " +
                "First Name: " + firstName + ", " +
                "Last Name: " + lastName + ", " +
                "Gender: " + gender + ", " +
                "Age: " + age + ", " +
                "City: " + city;
    }
}
