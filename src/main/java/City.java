import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCity;
    @Column(name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Employee> employees;

    public City(String cityName) {
            this.cityName = cityName;
        }

    public City() {

    }

    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity=" + idCity +
                ", cityName='" + cityName + '\'' +
                ", employees=" + employees +
                '}';
    }


}
