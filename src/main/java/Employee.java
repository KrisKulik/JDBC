public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int idCity;

    public Employee(int id, String firstName, String lastName, String gender, int age, int idCity) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.idCity = idCity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    @Override
    public String toString() {
        return  "id: " + id + ", " +
                "First Name: " + firstName + ", " +
                "Last Name: " + lastName + ", " +
                "Gender: " + gender + ", " +
                "Age: " + age + ", " +
                "City id: " + idCity;
    }
}
