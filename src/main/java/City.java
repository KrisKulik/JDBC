public class City {
    private int idCity;
    private String cityName;

    public City(int idCity, String cityName) {
        this.idCity = idCity;
        this.cityName = cityName;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
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
