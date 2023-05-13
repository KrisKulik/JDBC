import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCity;
    @Column(name = "city_name", length = 168, nullable = false)
    private String cityName;

    public City(int idCity, String cityName) {
        this.idCity = idCity;
        this.cityName = cityName;
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

    @Override
    public String toString() {
        return "City id: " + idCity +
                "City name: " + cityName + '\'';
    }
}
